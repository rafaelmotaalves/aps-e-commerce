package br.ufpe.cin.Ecommerce.controllers;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class AdicionarProdutoForm {
    @NotNull
    @Positive
    public Integer quantidade;
    @NotNull
    public Long idCliente;
   
    public AdicionarProdutoForm() {}

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

}
