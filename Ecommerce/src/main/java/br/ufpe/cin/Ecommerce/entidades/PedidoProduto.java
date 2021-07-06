package br.ufpe.cin.Ecommerce.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PedidoProduto {
	
	@Id
	@GeneratedValue
	private Long id;
	private Integer quantidade;


	@ManyToOne
	private Produto produto;

	public PedidoProduto() {}

	public PedidoProduto(Long id, Integer quantidade, Produto produto) {
		this.id = id;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double calcularValor() {
		return quantidade * produto.getValor();
	}
}
