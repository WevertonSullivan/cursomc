package com.weverton.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weverton.cursomc.domains.Estado;

/**
 * @author weverton
 * 
 * Camada de acesso a dados.
 * JpaRepository: Acessa os dados com base no tipo recebido; neste caso Categoria.
 */

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	
}
