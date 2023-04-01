package edu.sesame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.Transport;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {
}
