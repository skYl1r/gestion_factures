package edu.sesame.imetier;

import java.util.List;

import org.springframework.data.domain.Page;

import edu.sesame.entities.Livraison;

public interface ILivraisonMetier {
	
	public List<Livraison> getAllLivraisons();

	public Page<Livraison> getAllLivraisons(int page, int size);

	public Livraison getLivraison(Long id);

	public Livraison saveLivraison(Livraison livraison);

	public boolean deleteLivraison(Long id);
}
