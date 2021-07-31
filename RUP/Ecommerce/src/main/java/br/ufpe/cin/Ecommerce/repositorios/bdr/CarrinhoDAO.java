package br.ufpe.cin.Ecommerce.repositorios.bdr;

import org.springframework.data.repository.CrudRepository;

import br.ufpe.cin.Ecommerce.entidades.Carrinho;

public interface CarrinhoDAO extends CrudRepository<Carrinho, Long> {
	
}
