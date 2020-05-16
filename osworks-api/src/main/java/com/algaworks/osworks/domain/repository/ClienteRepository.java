package com.algaworks.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.model.Cliente;

@Repository //gerenciado pelo spring
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	List<Cliente> findByNome(String nome); //especificando um atributo do cliente
	List<Cliente> findByNomeContaining(String nome);	//tipo o like do sql
	
	Cliente findByEmail (String email);
	
	
	}
	

