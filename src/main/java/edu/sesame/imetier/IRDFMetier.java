package edu.sesame.imetier;

import edu.sesame.entities.ReductionFacture;

public interface IRDFMetier {
	
	public ReductionFacture getReductionFacture(Long id);

	public ReductionFacture saveReductionFacture(ReductionFacture reglementFacture);

	public boolean deleteReductionFacture(Long id);
}
