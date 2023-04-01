package edu.sesame.metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sesame.dao.LcRepository;
import edu.sesame.entities.LigneCommande;
import edu.sesame.imetier.ILcMetier;

@Service
@Transactional
public class LcMetierImpl implements ILcMetier {
	
	@Autowired
	private LcRepository lncRep;

	@Override
	public LigneCommande getLigneCommande(Long id) {
		return lncRep.getOne(id);
	}

	@Override
	public LigneCommande saveLigneCommande(LigneCommande lc) {
		return lncRep.save(lc);
	}

	@Override
	public boolean deleteLigneCommande(Long id) {
		LigneCommande lc = lncRep.getOne(id);
		if (lc == null)
			return false;
		lncRep.delete(lc);
		return true;
	}

	@Override
	public LigneCommande getLigneCommandeByProduit(Long numeroCommande, String ref) {
		return lncRep.findLcByProduit(numeroCommande, ref);
	}
}
