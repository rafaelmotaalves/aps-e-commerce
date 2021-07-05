package br.ufpe.cin.Ecommerce.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;

@Component
public class RepositorioClienteBDR implements IRepositorioCliente {

	@Autowired
	private ClienteDAO clienteDAO;

	@Autowired
	private CarrinhoDAO carrinhoDAO;

	@Override
	public Cliente atualizar(Cliente cliente) {

		Carrinho carrinho = cliente.getCarrinhoAtual();

		carrinhoDAO.save(carrinho);
		
		return clienteDAO.save(cliente);
	}
	
}
