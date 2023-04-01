package edu.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.Livraison;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Long> {
}
