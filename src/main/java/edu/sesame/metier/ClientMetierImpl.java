package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.sesame.dao.ClientRepository;
import edu.sesame.entities.Client;
import edu.sesame.imetier.IClientMetier;

@Service
@Transactional
public class ClientMetierImpl implements IClientMetier {
	
	@Autowired
	private ClientRepository cltRep;

	@Override
	public List<Client> getClients() {
		return cltRep.findAll();
	}

	@Override
	public Client getClient(String code) {
		try {
			return cltRep.findByCode(code);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Client saveClient(Client frs) {
		return cltRep.save(frs);
	}

	@Override
	public boolean deleteClient(String code) {
		Client frs = cltRep.findByCode(code);
		if (frs != null) {
			cltRep.delete(frs);
			return true;
		}
		return false;
	}

	@Override
	public Page<Client> getClients(int page, int size) {
		return cltRep.findAll(PageRequest.of(page, size));
	}

	@Override
	public Page<Client> getClientsByMotCle(String mc, int page, int size) {
		return cltRep.findAllByMotCle(mc, PageRequest.of(page, size));
	}
}
