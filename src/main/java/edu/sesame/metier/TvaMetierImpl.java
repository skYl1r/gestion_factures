package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import edu.sesame.dao.TvaRepository;
import edu.sesame.entities.Tva;
import edu.sesame.imetier.ITvaMetier;

@Service
@Transactional
public class TvaMetierImpl implements ITvaMetier {
	
	@Autowired
	private TvaRepository tvaRep;

	@Override
	public List<Tva> getTvas() {
		return tvaRep.findAll();
	}

	@Override
	public Page<Tva> getTvas(int page, int size) {
		return null;
	}

	@Override
	public Page<Tva> getTvasByDesignation(String designation, int page, int size) {
		return null;
	}

	@Override
	public Tva getTva(Long code) {
		return tvaRep.getOne(code);
	}

	@Override
	public Tva saveTva(Tva tva) {
		return tvaRep.save(tva);
	}

	@Override
	public boolean deleteTva(Long code) {
		Tva tva = getTva(code);
		if (tva == null)
			return false;
		tvaRep.delete(tva);
		return true;
	}
}
