package br.ufpe.cin.Ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.ufpe.cin.Ecommerce.controladores.Fachada;
import br.ufpe.cin.Ecommerce.entidades.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	private Fachada fachada;

	@PostMapping("/clientes")	
	public Cliente criarCliente(@Valid @RequestBody Cliente cliente) {
		return fachada.criarCliente(cliente);
	}


}
