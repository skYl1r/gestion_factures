package edu.sesame;

import java.util.Objects;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.sesame.dao.RoleRepository;
import edu.sesame.dao.UserRepository;
import edu.sesame.dao.UserRolesRepository;
import edu.sesame.entities.Role;
import edu.sesame.entities.User;
import edu.sesame.entities.UsersRoles;

@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner createAdmin(UserRepository userRepository, RoleRepository roleRepository,
			UserRolesRepository userRolesRepository) {
		return new CommandLineRunner() {
			private static final String USERNAME = "admin";
			private static final String ROLE = "ADMIN";
			
			private User user;
			private Role role;
			
			@Override
			public void run(String... args) throws Exception {
				if(Objects.isNull(user = userRepository.findByUserName(USERNAME))) {
					String password = new BCryptPasswordEncoder().encode(USERNAME);
					user = new User(USERNAME, password, true);
					userRepository.save(user);
					if(Objects.isNull(role = roleRepository.findByRole(ROLE))) {
						role = new Role(ROLE);
						roleRepository.save(role);
					}
					UsersRoles usersRoles = new UsersRoles();
					usersRoles.setUser(user);
					usersRoles.setRole(role);
					userRolesRepository.save(usersRoles);
				}
			}
		};
	}
}
