package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.sesame.dao.ReductionRepository;
import edu.sesame.entities.Reduction;
import edu.sesame.imetier.IReductionMetier;

@Service
@Transactional
public class ReductionMetierImpl implements IReductionMetier {
	
	@Autowired
	private ReductionRepository regRep;

	@Override
	public List<Reduction> getReductions() {
		return regRep.findAll();
	}

	@Override
	public Page<Reduction> getReductions(int page, int size) {
		return regRep.findAll(new PageRequest(page, size));
	}

	@Override
	public Reduction getReduction(Long id) {
		return regRep.getOne(id);
	}

	@Override
	public Reduction saveReduction(Reduction reglement) {
		return regRep.save(reglement);
	}

	@Override
	public boolean deleteReduction(Long id) {
		return false;
	}
}
