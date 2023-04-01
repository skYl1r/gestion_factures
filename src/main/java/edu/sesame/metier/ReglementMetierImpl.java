package edu.sesame.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.sesame.dao.ReglementRepository;
import edu.sesame.entities.Reglement;
import edu.sesame.imetier.IReglementMetier;

@Service
@Transactional
public class ReglementMetierImpl implements IReglementMetier {
	
	@Autowired
	private ReglementRepository regRep;

	@Override
	public List<Reglement> getReglements() {
		return regRep.findAll();
	}

	@Override
	public Page<Reglement> getReglements(int page, int size) {
		return regRep.findAll(PageRequest.of(page, size));
	}

	@Override
	public Reglement getReglement(Long id) {
		return regRep.getOne(id);
	}

	@Override
	public Reglement saveReglement(Reglement reglement) {
		return regRep.save(reglement);
	}

	@Override
	public boolean deleteReglement(Long id) {
		return false;
	}
}
