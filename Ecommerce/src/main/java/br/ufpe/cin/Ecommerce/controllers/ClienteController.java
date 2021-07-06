package br.ufpe.cin.Ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.ufpe.cin.Ecommerce.controladores.Fachada;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	private Fachada fachada;

	@PostMapping("/clientes")	
	public Cliente criarCliente(@Valid @RequestBody Cliente cliente) {
		return fachada.criarCliente(cliente);
	}

	@GetMapping("/clientes/{id}/carrinho")
	public String pegarCarrinho(@PathVariable(name="id") Long idCliente, Model model) {
		Carrinho carrinho = fachada.pegarCarrinho(idCliente);
		
		if (carrinho == null) {
			return "404";
		}
		model.addAttribute("items", carrinho.getItems());
		model.addAttribute("total", carrinho.calcularValor());

		return "carrinho";
	}


}
