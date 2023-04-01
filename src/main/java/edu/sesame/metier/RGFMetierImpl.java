package edu.sesame.metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sesame.dao.ReglementFactureRepository;
import edu.sesame.entities.ReglementFacture;
import edu.sesame.imetier.IRGFMetier;

@Service
@Transactional
public class RGFMetierImpl implements IRGFMetier {
	
	@Autowired
	private ReglementFactureRepository regRep;

	@Override
	public ReglementFacture getReglementFacture(Long id) {
		return regRep.getOne(id);
	}

	@Override
	public ReglementFacture saveReglementFacture(ReglementFacture reglementFacture) {
		return regRep.save(reglementFacture);
	}

	@Override
	public boolean deleteReglementFacture(Long id) {
		ReglementFacture rgf = regRep.getOne(id);
		if (rgf == null)
			return false;
		regRep.delete(rgf);
		return true;
	}
}
