package com.bustamante.sisgestion.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bustamante.sisgestion.entity.Infraccion;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{

	List<Infraccion> findByPlacaContaining(String placa, Pageable page);
	
}
