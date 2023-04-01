package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.sesame.dao.FournisseurRepository;
import edu.sesame.entities.Fournisseur;
import edu.sesame.imetier.IFournisseurMetier;

@Service
@Transactional
public class FournisseurMetierImpl implements IFournisseurMetier {
	
	@Autowired
	private FournisseurRepository frsRep;

	@Override
	public List<Fournisseur> getFournisseurs() {
		return frsRep.findAll();
	}

	@Override
	public Fournisseur getFournisseur(String code) {
		try {
			return frsRep.findByCode(code);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Fournisseur saveFournisseur(Fournisseur frs) {
		return frsRep.save(frs);
	}

	@Override
	public boolean deleteFournisseur(String code) {
		Fournisseur frs = frsRep.findByCode(code);
		if (frs != null) {
			frsRep.delete(frs);
			return true;
		}
		return false;
	}

	@Override
	public Page<Fournisseur> getFournisseursByMotCle(String mc, int page, int size) {
		return frsRep.findAllByMotCle(mc, PageRequest.of(page, size));
	}
}
