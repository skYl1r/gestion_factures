package edu.sesame.imetier;

import edu.sesame.entities.ReglementFacture;

public interface IRGFMetier {
	
	public ReglementFacture getReglementFacture(Long id);

	public ReglementFacture saveReglementFacture(ReglementFacture reglementFacture);

	public boolean deleteReglementFacture(Long id);
}
