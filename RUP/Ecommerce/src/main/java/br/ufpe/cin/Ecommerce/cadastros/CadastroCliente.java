package br.ufpe.cin.Ecommerce.cadastros;

import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioCliente;

public class CadastroCliente {
	
	private IRepositorioCliente repositorioCliente;


	public CadastroCliente(IRepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}

	public Cliente salvar(Cliente cliente) {
		return repositorioCliente.atualizar(cliente);
	}

	public Cliente criar(Cliente cliente) {
		return repositorioCliente.atualizar(cliente);
	}

	public Cliente pegarCliente(Long id) {
		return repositorioCliente.pegar(id);
	}

}
