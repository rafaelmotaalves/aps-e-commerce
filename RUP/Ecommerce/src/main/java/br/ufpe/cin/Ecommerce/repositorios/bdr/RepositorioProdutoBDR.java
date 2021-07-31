package br.ufpe.cin.Ecommerce.repositorios.bdr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.entidades.Produto;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioProduto;

@Component
public class RepositorioProdutoBDR implements IRepositorioProduto {

	@Autowired
	private ProdutoDAO produtoDAO;

	@Override
	public Produto pegar(Long id) {
		return produtoDAO.findById(id).orElse(null);
	}

	@Override
	public Iterable<Produto> pegarTodos() {
		return produtoDAO.findAll();
	}

	@Override
	public Produto criar(Produto produto) {
		return produtoDAO.save(produto);
	}
	
}
