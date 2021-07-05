package br.ufpe.cin.Ecommerce.repositorios;

import org.springframework.data.repository.CrudRepository;

import br.ufpe.cin.Ecommerce.entidades.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Long> {
	
}
