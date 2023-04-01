package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import edu.sesame.dao.LivraisonRepository;
import edu.sesame.entities.Livraison;
import edu.sesame.imetier.ILivraisonMetier;

@Service
@Transactional
public class LivraisonMetierImpl implements ILivraisonMetier {
	
	@Autowired
	private LivraisonRepository livRep;

	@Override
	public List<Livraison> getAllLivraisons() {
		return null;
	}

	@Override
	public Page<Livraison> getAllLivraisons(int page, int size) {
		return null;
	}

	@Override
	public Livraison getLivraison(Long id) {
		return livRep.findById(id).get();
	}

	@Override
	public Livraison saveLivraison(Livraison livraison) {
		return livRep.save(livraison);
	}

	@Override
	public boolean deleteLivraison(Long id) {
		livRep.delete(this.getLivraison(id));
		return true;
	}
}
