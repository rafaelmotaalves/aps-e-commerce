package br.ufpe.cin.Ecommerce.repositorios;

import br.ufpe.cin.Ecommerce.entidades.Cliente;

public interface IRepositorioCliente {
	public Cliente atualizar(Cliente cliente);
	public Cliente pegar(Long id);
}
