package edu.sesame.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.sesame.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
	@Query("select frs from Fournisseur frs where frs.code = :x")
	public Fournisseur findByCode(@Param("x") String code);

	@Query("select p from Fournisseur p where p.code not like 'CODE_0' and (p.code like :x or p.nom like :x or p.raisonSociale like :x or p.capital like :x or p.adresse like :x or p.email like :x or p.tel like :x or p.fax like :x)")
	public Page<Fournisseur> findAllByMotCle(@Param("x") String mc, Pageable pageable);
}
