package br.ufpe.cin.Ecommerce.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.ufpe.cin.Ecommerce.controladores.Fachada;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	private Fachada fachada;
	
	@GetMapping("/clientes/{id}")	
	public String exibirClientes(@PathVariable(name="id") Long id, Model model) {
		Cliente c = fachada.pegarCliente(id);
		model.addAttribute("cliente", fachada.pegarCliente(id));
		return "cliente";
	}

	@GetMapping("/cliente")	
	public String formularioCliente(Model model) {
		model.addAttribute("command", new AdicionarClienteForm());
		return "cliente_form";
	}

	@PostMapping("/clientes")	
	public String registrarCliente(
		@Valid @ModelAttribute("command") AdicionarClienteForm adicionarClienteForm, 
		Model model
	) {
		Cliente novoCliente = new Cliente(
			adicionarClienteForm.cpf,
			adicionarClienteForm.nome,
			adicionarClienteForm.endereco,
			adicionarClienteForm.email,
			null
		);
		fachada.criarCliente(novoCliente);
		return "redirect:/clientes/" + novoCliente.getId();
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
