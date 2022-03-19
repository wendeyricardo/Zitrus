package br.com.zitrus.sistema.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
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
}
