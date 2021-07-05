package br.ufpe.cin.Ecommerce.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.entidades.Produto;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioProduto;

@Component
public class CadastroProduto {

	@Autowired
	IRepositorioProduto repositorioProduto;

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
