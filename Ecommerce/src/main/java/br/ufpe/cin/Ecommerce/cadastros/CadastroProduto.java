package br.ufpe.cin.Ecommerce.cadastros;

import br.ufpe.cin.Ecommerce.entidades.Produto;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioProduto;

public class CadastroProduto {

	IRepositorioProduto repositorioProduto;

	public CadastroProduto(IRepositorioProduto repositorioProduto) {
		this.repositorioProduto = repositorioProduto;
	}

	public Produto pegar(Long id) {
		return repositorioProduto.pegar(id);
	}

	public Iterable<Produto> pegarTodos() {
		return repositorioProduto.pegarTodos();
	}

	public Produto criar(Produto produto) {
		return repositorioProduto.criar(produto);
	}
}
