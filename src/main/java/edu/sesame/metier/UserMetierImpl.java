package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.sesame.dao.UserRepository;
import edu.sesame.entities.User;
import edu.sesame.imetier.IUserMetier;

@Service
@Transactional
public class UserMetierImpl implements IUserMetier {
	
	@Autowired
	private UserRepository cltRep;

	@Override
	public List<User> getUsers() {
		return cltRep.findAll();
	}

	@Override
	public User getUser(String code) {
		try {
			return cltRep.findByUserName(code);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public User saveUser(User frs) {
		return cltRep.save(frs);
	}

	@Override
	public boolean deleteUser(String code) {
		User frs = cltRep.findByUserName(code);
		if (frs != null) {
			cltRep.delete(frs);
			return true;
		}
		return false;
	}

	@Override
	public Page<User> getUsers(int page, int size) {
		return cltRep.findAll(PageRequest.of(page, size));
	}

	@Override
	public Page<User> getUsersByMotCle(String mc, int page, int size) {
		return cltRep.findAllByMotCle(mc, PageRequest.of(page, size));
	}
}
