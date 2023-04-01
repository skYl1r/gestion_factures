package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.sesame.dao.ProduitRepository;
import edu.sesame.entities.Produit;
import edu.sesame.imetier.IProduitMetier;

@Service
@Transactional
public class ProduitMetierImpl implements IProduitMetier {
	
	@Autowired
	private ProduitRepository prdRep;

	@Override
	public Page<Produit> getProduitsByFamille(Long codeFamille, int page, int size) {
		return prdRep.getAllByCodeFamille(codeFamille, PageRequest.of(page, size));
	}

	@Override
	public Produit getProduit(String ref) {
		return prdRep.getById(ref);
	}

	@Override
	public Page<Produit> getProduitsByMotCle(String mc, int page, int size) {
		return prdRep.findAllByMotCle(mc, PageRequest.of(page, size));
	}

	@Override
	public Produit saveProduit(Produit produit) {
		return prdRep.save(produit);
	}

	@Override
	public boolean deleteProduit(String ref) {
		Produit prd = prdRep.getById(ref);
		if (prd != null) {
			prdRep.delete(prd);
			return true;
		}
		return false;
	}

	@Override
	public List<Produit> getProduitsByFamille(Long codeFamille) {
		return null;
	}

	@Override
	public List<Produit> getProduits() {
		return prdRep.findAll();
	}
}
