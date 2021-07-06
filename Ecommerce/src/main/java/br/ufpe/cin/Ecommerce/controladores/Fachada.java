package br.ufpe.cin.Ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.entidades.Produto;

@Component
public class Fachada {
	@Autowired
	private ControladorProduto controladorProduto;
	@Autowired
	private ControladorCliente controladorCliente;
	@Autowired
	private ControladorAdicionarProduto controladorAdicionarProduto;

	public Produto pegarProduto(Long id) {
		return controladorProduto.pegarProduto(id);
	}

	public Iterable<Produto> pegarTodosProdutos() {
		return controladorProduto.pegarTodosProdutos();
	}

	public Produto criarProduto(Produto produto) {
		return controladorProduto.criarProduto(produto);		
	}

	public Cliente criarCliente(Cliente cliente) {
		return controladorCliente.criarCliente(cliente);
	}

	public Carrinho adicionarProduto(Long idCliente, Long idProduto , Integer quantidade) {
		return controladorAdicionarProduto.adicionarProduto(idCliente, idProduto, quantidade);
	}

	public Carrinho pegarCarrinho(Long idCliente) {
		return controladorCliente.pegarCarrinho(idCliente);
	}
}
