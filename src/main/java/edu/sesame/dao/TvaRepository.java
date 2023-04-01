package edu.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.Tva;

@Repository
public interface TvaRepository extends JpaRepository<Tva, Long> {
}
