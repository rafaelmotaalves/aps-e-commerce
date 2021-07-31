package br.ufpe.cin.Ecommerce.repositorios.bdr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.repositorios.FabricaAbstrataRepositorio;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioCliente;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioProduto;


@Component
public class FabricaRepositorioBDR implements FabricaAbstrataRepositorio {

	@Autowired
	private RepositorioClienteBDR repositorioClienteBDR;
	@Autowired
	private RepositorioProdutoBDR repositorioProdutoBDR;

	@Override
	public IRepositorioCliente repositorioCliente() {
		return (IRepositorioCliente) repositorioClienteBDR;
	}

	@Override
	public IRepositorioProduto repositorioProduto() {
		return (IRepositorioProduto) repositorioProdutoBDR;
	}

}
