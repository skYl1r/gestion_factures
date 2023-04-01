package edu.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.ReductionFacture;

@Repository
public interface ReductionFactureRepository extends JpaRepository<ReductionFacture, Long> {
}
