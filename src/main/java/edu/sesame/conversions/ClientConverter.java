package edu.sesame.conversions;

import org.springframework.core.convert.converter.Converter;

import edu.sesame.entities.Client;
import edu.sesame.imetier.IClientMetier;

public final class ClientConverter implements Converter<String, Client> {

	private IClientMetier mc;

	public ClientConverter(IClientMetier mc) {
		this.mc = mc;
	}

	@Override
	public Client convert(String id) {
		return mc.getClient(id);
	}
}