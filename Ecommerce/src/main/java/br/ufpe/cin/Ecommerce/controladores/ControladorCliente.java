package br.ufpe.cin.Ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.cadastros.CadastroCliente;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;


@Component
public class ControladorCliente {
	
	@Autowired
	private CadastroCliente cadastroCliente;
	
	public Cliente criarCliente(Cliente cliente) {
		cliente.novoCarrinho();

		return cadastroCliente.salvar(cliente);
	}

	public Carrinho pegarCarrinho(Long idCliente) {
		Cliente cliente = cadastroCliente.pegarCliente(idCliente);

		if (cliente == null) {
			return null;
		}

		return cliente.getCarrinhoAtual();
	}
}
