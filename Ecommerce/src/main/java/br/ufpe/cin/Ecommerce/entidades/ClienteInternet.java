package br.ufpe.cin.Ecommerce.entidades;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class ClienteInternet extends Cliente {
    @NotBlank(message = "Email é obrigatório")
    public String email;
    @NotBlank(message = "Senha é obrigatório")
    public String senha;

    public ClienteInternet(String cpf, Carrinho carrinhoAtual, String email, String senha) {
        super(cpf, carrinhoAtual);
        this.email = email;
        this.senha = senha;
    }

    public ClienteInternet() {}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}