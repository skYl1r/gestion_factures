package edu.sesame.imetier;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;

import edu.sesame.entities.Client;
import edu.sesame.entities.Commande;
import edu.sesame.entities.Dossier;
import edu.sesame.entities.Fournisseur;

public interface ICommandeMetier {
	
	public List<Commande> getCommandes();

	public Page<Commande> getCommandes(Long numDossier, int page, int size);

	public Page<Commande> getCommandesClients(Long numDossier, int page, int size);

	public Page<Commande> getCommandesClients(Long numDossier, Date date, int page, int size);

	public Page<Commande> getCommandesClients(Long numDossier, Boolean valide, int page, int size);

	public Page<Commande> getCommandesClients(Long numDossier, Boolean valide, Date date, int page, int size);

	public Page<Commande> getCommandesOfClient(Long numDossier, String code, int page, int size);

	public Page<Commande> getCommandesOfClient(Long numDossier, String code, Date date, int page, int size);

	public Page<Commande> getCommandesOfClient(Long numDossier, String code, Boolean valide, int page, int size);

	public Page<Commande> getCommandesOfClient(Long numDossier, String code, Boolean valide, Date date, int page,
			int size);

	public Page<Commande> getCommandesFournisseurs(Long numDossier, int page, int size);

	public Page<Commande> getCommandesFournisseurs(Long numDossier, Date date, int page, int size);

	public Page<Commande> getCommandesFournisseurs(Long numDossier, Boolean valide, int page, int size);

	public Page<Commande> getCommandesFournisseurs(Long numDossier, Boolean valide, Date date, int page, int size);

	public Page<Commande> getCommandesOfFournisseur(Long numDossier, String code, int page, int size);

	public Page<Commande> getCommandesOfFournisseur(Long numDossier, String code, Date date, int page, int size);

	public Page<Commande> getCommandesOfFournisseur(Long numDossier, String code, Boolean valide, int page, int size);

	public Page<Commande> getCommandesOfFournisseur(Long numDossier, String code, Boolean valide, Date date, int page,
			int size);

	public int getNombreCommandes(Long numDossier);

	public int getNombreCommandes(Date d1, Date d2);

	public Commande getCommande(Long num);

	public Commande saveCommande(Commande commande);

	public Commande saveCommande(Long num, Date date, boolean valide, Client clt, Fournisseur frs, Dossier dos);

	public boolean deleteCommande(Long num);
}
