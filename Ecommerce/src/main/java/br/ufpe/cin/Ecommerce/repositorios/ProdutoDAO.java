package br.ufpe.cin.Ecommerce.repositorios;

import org.springframework.data.repository.CrudRepository;

import br.ufpe.cin.Ecommerce.entidades.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Long> {
	
}
