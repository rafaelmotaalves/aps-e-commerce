package br.ufpe.cin.Ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.cadastros.CadastroProduto;
import br.ufpe.cin.Ecommerce.entidades.Produto;

@Component
public class ControladorProduto {
	@Autowired
	private CadastroProduto cadastroProduto;

	public Produto pegarProduto(Long id) {
		return cadastroProduto.pegar(id);	
	}

	public Iterable<Produto> pegarTodosProdutos() {
		return cadastroProduto.pegarTodos();
	}

	public Produto criarProduto(Produto produto) {
		return cadastroProduto.criar(produto);
	}

}
