package br.ufpe.cin.Ecommerce.repositorios;

import org.springframework.data.repository.CrudRepository;

import br.ufpe.cin.Ecommerce.entidades.PedidoProduto;

public interface PedidoProdutoDAO extends CrudRepository<PedidoProduto, Long> {
    
}
