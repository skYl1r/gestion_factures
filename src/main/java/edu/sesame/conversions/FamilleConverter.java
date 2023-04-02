package edu.sesame.conversions;

import org.springframework.core.convert.converter.Converter;

import edu.sesame.entities.Famille;
import edu.sesame.imetier.IFamilleMetier;

public class FamilleConverter implements Converter<String, Famille>{

	private IFamilleMetier fm;

	public FamilleConverter(IFamilleMetier fm) {
		this.fm = fm;
	}

	@Override
	public Famille convert(String id) {
		return fm.getFamille(Long.valueOf(id));
	}
	
}
