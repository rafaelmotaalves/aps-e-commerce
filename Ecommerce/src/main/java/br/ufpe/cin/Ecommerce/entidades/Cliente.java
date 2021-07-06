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
    @NotBlank(message = "Nome é obrigatório")
    public String nome;
    @NotBlank(message = "Endereço é obrigatório")
    public String endereco;
    @NotBlank(message = "Email é obrigatório")
    public String email;

	public Cliente(String cpf, String nome, String endereco, String email, Carrinho carrinhoAtual) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.carrinhoAtual = carrinhoAtual;
	}

	public Cliente() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
