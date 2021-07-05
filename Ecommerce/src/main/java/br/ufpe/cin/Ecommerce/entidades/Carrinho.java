package br.ufpe.cin.Ecommerce.entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrinho {
	@Id
	@GeneratedValue
	private Long id;	
	@OneToMany
	private Set<PedidoProduto> items;
	
	public Carrinho(Long id, Set<PedidoProduto> items) {
		this.id = id;
		this.items = items;
	}
	
	public Carrinho () {}

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
}
