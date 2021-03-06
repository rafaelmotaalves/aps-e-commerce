package br.ufpe.cin.Ecommerce.repositorios.bdr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.controladores.ClienteExistenteException;
import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioCliente;

@Component
public class RepositorioClienteBDR implements IRepositorioCliente {

	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public Cliente atualizar(Cliente cliente) {
		try {
			return clienteDAO.save(cliente);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Cliente pegar(Long id) {
		return clienteDAO.findById(id).orElse(null);
	}
	
}
