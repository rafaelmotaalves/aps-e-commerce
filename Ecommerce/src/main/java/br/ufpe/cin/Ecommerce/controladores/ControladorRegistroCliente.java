package br.ufpe.cin.Ecommerce.controladores;

import br.ufpe.cin.Ecommerce.cadastros.CadastroCliente;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.ClienteInternet;
import br.ufpe.cin.Ecommerce.entidades.Cliente;


public class ControladorRegistroCliente {
	
	private CadastroCliente cadastroCliente;

	public ControladorRegistroCliente(CadastroCliente cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	public Cliente cadastrar(String cpf, String email, String senha) {
		Cliente cliente = new ClienteInternet(
			cpf,
			null,
			email,
			senha
		);
		return cadastroCliente.criar(cliente);
	}
}
