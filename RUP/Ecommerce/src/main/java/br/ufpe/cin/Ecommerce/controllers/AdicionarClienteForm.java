package br.ufpe.cin.Ecommerce.controllers;

import javax.validation.constraints.NotNull;

public class AdicionarClienteForm {
    @NotNull
    public String cpf;
    @NotNull
    public String email;
    @NotNull
    public String senha;
   
    public AdicionarClienteForm() {}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
