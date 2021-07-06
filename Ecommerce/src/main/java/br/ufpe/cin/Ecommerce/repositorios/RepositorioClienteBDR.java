package br.ufpe.cin.Ecommerce.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.entidades.Cliente;

@Component
public class RepositorioClienteBDR implements IRepositorioCliente {

	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public Cliente atualizar(Cliente cliente) {	
		return clienteDAO.save(cliente);
	}

	@Override
	public Cliente pegar(Long id) {
		return clienteDAO.findById(id).orElse(null);
	}
	
}
