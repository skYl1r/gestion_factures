package edu.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.Reglement;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement, Long> {
}
