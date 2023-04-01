package edu.sesame.metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sesame.dao.ReductionFactureRepository;
import edu.sesame.entities.ReductionFacture;
import edu.sesame.imetier.IRDFMetier;

@Service
@Transactional
public class RDFMetierImpl implements IRDFMetier {
	
	@Autowired
	private ReductionFactureRepository rdfRep;

	@Override
	public ReductionFacture getReductionFacture(Long id) {
		return rdfRep.getOne(id);
	}

	@Override
	public ReductionFacture saveReductionFacture(ReductionFacture reglementFacture) {
		return rdfRep.save(reglementFacture);
	}

	@Override
	public boolean deleteReductionFacture(Long id) {
		ReductionFacture rdf = rdfRep.getOne(id);
		if (rdf == null)
			return false;
		rdfRep.delete(rdf);
		return true;
	}
}
