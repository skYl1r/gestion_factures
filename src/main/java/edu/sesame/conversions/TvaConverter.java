package edu.sesame.conversions;

import org.springframework.core.convert.converter.Converter;

import edu.sesame.entities.Tva;
import edu.sesame.imetier.ITvaMetier;

public class TvaConverter implements Converter<String, Tva>{

	private ITvaMetier tvam;

	public TvaConverter(ITvaMetier tvam) {
		this.tvam = tvam;
	}

	@Override
	public Tva convert(String id) {
		return tvam.getTva(Long.valueOf(id));
	}
	
}
