package edu.sesame.imetier;

import java.util.List;

import org.springframework.data.domain.Page;

import edu.sesame.entities.Reduction;

public interface IReductionMetier {
	
	public List<Reduction> getReductions();

	public Page<Reduction> getReductions(int page, int size);

	public Reduction getReduction(Long id);

	public Reduction saveReduction(Reduction reduction);

	public boolean deleteReduction(Long id);
}
