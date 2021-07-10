package br.ufpe.cin.Ecommerce.entidades;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Carrinho carrinhoAtual;
	@NotBlank(message = "CPF é obrigatório")
    public String cpf;
	public Cliente(String cpf, Carrinho carrinhoAtual) {
		this.cpf = cpf;
		this.carrinhoAtual = carrinhoAtual;
	}

	public Cliente() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
