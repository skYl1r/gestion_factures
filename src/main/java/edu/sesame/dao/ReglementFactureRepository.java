package edu.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.ReglementFacture;

@Repository
public interface ReglementFactureRepository extends JpaRepository<ReglementFacture, Long> {
}
