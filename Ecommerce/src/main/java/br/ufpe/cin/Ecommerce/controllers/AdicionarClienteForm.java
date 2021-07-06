package br.ufpe.cin.Ecommerce.controllers;

import javax.validation.constraints.NotNull;

public class AdicionarClienteForm {
    @NotNull
    public String cpf;
    @NotNull
    public String nome;
    @NotNull
    public String endereco;
    @NotNull
    public String email;
   
    public AdicionarClienteForm() {}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

}
