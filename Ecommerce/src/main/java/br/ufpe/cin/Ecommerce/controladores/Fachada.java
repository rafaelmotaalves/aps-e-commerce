package br.ufpe.cin.Ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.entidades.Produto;

@Component
public class Fachada {
	@Autowired
	private ControladorProduto controladorProduto;
	@Autowired ControladorCliente controladorCliente;


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

}
