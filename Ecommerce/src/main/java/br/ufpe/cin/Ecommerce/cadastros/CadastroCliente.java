package br.ufpe.cin.Ecommerce.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioCliente;

@Component
public class CadastroCliente {
	
	@Autowired
	private IRepositorioCliente repositorioCliente;


	public Cliente salvar(Cliente cliente) {
		return repositorioCliente.atualizar(cliente);
	}

	public Cliente pegarCliente(Long id) {
		return repositorioCliente.pegar(id);
	}

}
