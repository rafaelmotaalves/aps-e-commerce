package br.ufpe.cin.Ecommerce.entidades;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrinho {
	@Id
	@GeneratedValue
	private Long id;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<PedidoProduto> items;

	public Carrinho(Long id, Set<PedidoProduto> items) {
		this.id = id;
		this.items = items;
	}

	public Carrinho() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<PedidoProduto> getItems() {
		return items;
	}

	public void setItems(Set<PedidoProduto> items) {
		this.items = items;
	}

	public void adicionarProduto(Produto produto, Integer quantidade) {
		PedidoProduto pedidoProduto = this.items.stream()
				.filter(pp -> pp.getProduto().getId() == produto.getId()).findFirst().orElse(null);

		if (pedidoProduto == null) {
			pedidoProduto = new PedidoProduto();

			pedidoProduto.setProduto(produto);
			pedidoProduto.setQuantidade(quantidade);

			this.items.add(pedidoProduto);
		} else {
			pedidoProduto.setQuantidade(pedidoProduto.getQuantidade() + quantidade);
		}
	}

	public double calcularValor() {
		double total = 0;

		for (PedidoProduto pedidoProduto : this.items) {
			total += pedidoProduto.calcularValor();
		}
		return total;
	}

}
