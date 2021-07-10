package br.ufpe.cin.Ecommerce.controllers;

import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.ufpe.cin.Ecommerce.controladores.CarrinhoCheioException;
import br.ufpe.cin.Ecommerce.controladores.Fachada;
import br.ufpe.cin.Ecommerce.entidades.Carrinho;
import br.ufpe.cin.Ecommerce.entidades.Produto;

@Controller
public class ProdutoController {
	
	@Autowired
	Fachada fachada;
	public static final AtomicLong idCounter = new AtomicLong();

	@GetMapping("/")
	public String getProdutos(Model model) {
		model.addAttribute("produtos", fachada.pegarTodosProdutos());

		return "produtos";
	}

	@GetMapping("/produtos/{id}")
	public String getProduto(@PathVariable(name="id") Long id, Model model) {
		Produto produto = fachada.pegarProduto(id);
		if (produto == null) {
			return "404";
		}

		model.addAttribute("command", new AdicionarProdutoForm());
		model.addAttribute("produto", fachada.pegarProduto(id));

		return "produto";
	}

	@PostMapping("/produtos")
	public Produto insertProduto(@Valid @RequestBody Produto produto) {
		return fachada.criarProduto(produto);
	}

	@PostMapping("/produtos/{idProduto}/carrinho")
	public String adicionarProduto(
		@PathVariable(name="idProduto") Long idProduto, 
		@Valid @ModelAttribute("command") AdicionarProdutoForm adicionarProdutoForm, 
		Model model
	) {
		Carrinho carrinho = null;
		try {
			carrinho = fachada.adicionarProduto(
				adicionarProdutoForm.idCliente, 
				idProduto, 
				adicionarProdutoForm.quantidade
			);
		} catch (CarrinhoCheioException e) {
			model.addAttribute("message", "O carrinho excedeu o tamanho máximo.");

			return "erro";
		}

		if (carrinho == null) {
			return "404";
		}

		return "redirect:/clientes/" + adicionarProdutoForm.idCliente.toString() + "/carrinho";
	}

}
