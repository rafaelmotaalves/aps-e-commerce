package br.ufpe.cin.Ecommerce.controladores;

import br.ufpe.cin.Ecommerce.cadastros.CadastroCliente;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;


public class ControladorCliente {
	
	private CadastroCliente cadastroCliente;

	public Cliente criarCliente(Cliente cliente) {
		cliente.novoCarrinho();

		return cadastroCliente.salvar(cliente);
	}

	public ControladorCliente(CadastroCliente cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	public Cliente pegarCliente(Long id) {
		return cadastroCliente.pegarCliente(id);
	}

	public Carrinho pegarCarrinho(Long idCliente) {
		Cliente cliente = cadastroCliente.pegarCliente(idCliente);

		if (cliente == null) {
			return null;
		}

		return cliente.getCarrinhoAtual();
	}
}
