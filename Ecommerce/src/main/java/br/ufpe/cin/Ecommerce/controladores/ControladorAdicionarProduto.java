package br.ufpe.cin.Ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ufpe.cin.Ecommerce.cadastros.CadastroCliente;
import br.ufpe.cin.Ecommerce.cadastros.CadastroProduto;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;
import br.ufpe.cin.Ecommerce.entidades.Produto;

@Component
public class ControladorAdicionarProduto {
   
    @Autowired
    private CadastroCliente cadastroCliente; 
    @Autowired
    private CadastroProduto cadastroProduto;
    
    public Carrinho adicionarProduto (Long idCliente, Long idProduto, Integer quantidade) {
        Cliente cliente = cadastroCliente.pegarCliente(idCliente);
        Produto produto = cadastroProduto.pegar(idProduto);
        
        if (cliente == null || produto == null) {
            return null;
        }

        Carrinho carrinho = cliente.getCarrinhoAtual();

        carrinho.adicionarProduto(produto, quantidade);

        cadastroCliente.salvar(cliente);

        return carrinho;
    }


}
