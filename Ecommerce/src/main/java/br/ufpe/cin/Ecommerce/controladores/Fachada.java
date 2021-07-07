package br.ufpe.cin.Ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.cadastros.CadastroCliente;
import br.ufpe.cin.Ecommerce.cadastros.CadastroProduto;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.entidades.Produto;
import br.ufpe.cin.Ecommerce.repositorios.FabricaAbstrataRepositorio;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioCliente;
import br.ufpe.cin.Ecommerce.repositorios.IRepositorioProduto;

@Component
public class Fachada {
	
	private ControladorProduto controladorProduto;
	private ControladorCliente controladorCliente;
	private ControladorAdicionarProduto controladorAdicionarProduto;

	@Autowired
	public Fachada(FabricaAbstrataRepositorio fabricaRepositorio) {
		IRepositorioCliente repositorioCliente = fabricaRepositorio.repositorioCliente();
		IRepositorioProduto repositorioProduto = fabricaRepositorio.repositorioProduto();

		CadastroCliente cadastroCliente = new CadastroCliente(repositorioCliente);
		CadastroProduto cadastroProduto = new CadastroProduto(repositorioProduto);

		this.controladorProduto = new ControladorProduto(cadastroProduto);
		this.controladorCliente = new ControladorCliente(cadastroCliente);
		this.controladorAdicionarProduto = new ControladorAdicionarProduto(cadastroCliente, cadastroProduto);
	}


	public Produto pegarProduto(Long id) {
		return controladorProduto.pegarProduto(id);
	}

	public Iterable<Produto> pegarTodosProdutos() {
		return controladorProduto.pegarTodosProdutos();
	}

	public Cliente pegarCliente(Long id) {
		return controladorCliente.pegarCliente(id);
	}

	public Produto criarProduto(Produto produto) {
		return controladorProduto.criarProduto(produto);		
	}

	public Cliente criarCliente(Cliente cliente) {
		return controladorCliente.criarCliente(cliente);
	}

	public Carrinho adicionarProduto(Long idCliente, Long idProduto , Integer quantidade) {
		return controladorAdicionarProduto.adicionarProduto(idCliente, idProduto, quantidade);
	}

	public Carrinho pegarCarrinho(Long idCliente) {
		return controladorCliente.pegarCarrinho(idCliente);
	}
}
