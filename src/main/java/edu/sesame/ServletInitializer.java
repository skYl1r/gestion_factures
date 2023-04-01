package edu.sesame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import edu.sesame.conversions.ClientConverter;
import edu.sesame.conversions.FournisseurConverter;
import edu.sesame.imetier.IClientMetier;
import edu.sesame.imetier.IFournisseurMetier;

@ServletComponentScan
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	@Configuration
	static class ConfigFormatter implements WebMvcConfigurer{
		
		@Autowired
		private IClientMetier mc;
		@Autowired
		private IFournisseurMetier mf;

		@Override
		public void addFormatters(FormatterRegistry registry) {
			registry.addConverter(new ClientConverter(mc));
			registry.addConverter(new FournisseurConverter(mf));
		}
	}
}
