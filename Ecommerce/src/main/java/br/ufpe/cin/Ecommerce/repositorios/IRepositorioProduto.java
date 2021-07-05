package br.ufpe.cin.Ecommerce.repositorios;

import br.ufpe.cin.Ecommerce.entidades.Produto;

public interface IRepositorioProduto {
	
	public Produto pegar(Long id);

	public Iterable<Produto> pegarTodos();

	public Produto criar(Produto produto);
}
