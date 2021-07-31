package br.ufpe.cin.Ecommerce.controladores;

import br.ufpe.cin.Ecommerce.cadastros.CadastroProduto;
import br.ufpe.cin.Ecommerce.entidades.Produto;

public class ControladorProduto {
	private CadastroProduto cadastroProduto;

	public ControladorProduto(CadastroProduto cadastroProduto) {
		this.cadastroProduto = cadastroProduto;
	}

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
