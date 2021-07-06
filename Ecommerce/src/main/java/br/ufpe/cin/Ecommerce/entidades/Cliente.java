package br.ufpe.cin.Ecommerce.entidades;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Carrinho carrinhoAtual;

	public Cliente(Long id, Carrinho carrinhoAtual) {
		this.id = id;
		this.carrinhoAtual = carrinhoAtual;
	}

	public Cliente() {
		this.novoCarrinho();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Carrinho getCarrinhoAtual() {
		return carrinhoAtual;
	}

	public void setCarrinhoAtual(Carrinho carrinhoAtual) {
		this.carrinhoAtual = carrinhoAtual;
	}

	public void novoCarrinho() {
		this.carrinhoAtual = new Carrinho();
		this.carrinhoAtual.setItems(new HashSet<PedidoProduto>());
	}

}
