package br.com.zitrus.sistema.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.zitrus.sistema.domain.Clientes;
import br.com.zitrus.sistema.service.ClientesService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClientesService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Clientes cliente) {
		return "/cliente/cadastro";		
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/cliente/lista";		
	}
	
	@GetMapping("/excluir")
	public String excluir() {
		return "/cliente/excluir";		
	}
	
	@PostMapping("/salvar")
	public String salvar(Clientes cliente, RedirectAttributes attr) {
		service.salvar(cliente);
		attr.addFlashAttribute("success", "cliente inserido com sucesso");
		return "redirect:/clientes/cadastrar";
	}
}
