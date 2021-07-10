package br.ufpe.cin.Ecommerce.controladores;

import br.ufpe.cin.Ecommerce.cadastros.CadastroCliente;
import br.ufpe.cin.Ecommerce.cadastros.CadastroProduto;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.entidades.Produto;

public class ControladorAdicionarProduto {

    public final int MAX_QUANTIDADE_ITEMS = 10;
   
    private CadastroCliente cadastroCliente; 
    private CadastroProduto cadastroProduto;
    
    public ControladorAdicionarProduto(CadastroCliente cadastroCliente, CadastroProduto cadastroProduto) {
        this.cadastroCliente = cadastroCliente;
        this.cadastroProduto = cadastroProduto;
    }

    public Carrinho adicionarProduto (Long idCliente, Long idProduto, Integer quantidade) throws CarrinhoCheioException {
        Cliente cliente = cadastroCliente.pegarCliente(idCliente);
        Produto produto = cadastroProduto.pegar(idProduto);
        
        if (cliente == null || produto == null) {
            return null;
        }

        Carrinho carrinho = cliente.getCarrinhoAtual();

        carrinho.adicionarProduto(produto, quantidade);

        if (carrinho.quantidadeItems() > MAX_QUANTIDADE_ITEMS) {
            throw new CarrinhoCheioException();
        }

        cadastroCliente.salvar(cliente);

        return carrinho;
    }


}
