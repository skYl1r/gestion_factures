package edu.sesame.imetier;

import java.util.List;

import org.springframework.data.domain.Page;

import edu.sesame.entities.Fournisseur;

public interface IFournisseurMetier {
	
	public List<Fournisseur> getFournisseurs();

	public Page<Fournisseur> getFournisseursByMotCle(String mc, int page, int size);

	public Fournisseur getFournisseur(String code);

	public Fournisseur saveFournisseur(Fournisseur frs);

	public boolean deleteFournisseur(String code);
}
