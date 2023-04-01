package edu.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.Reduction;

@Repository
public interface ReductionRepository extends JpaRepository<Reduction, Long> {
}
