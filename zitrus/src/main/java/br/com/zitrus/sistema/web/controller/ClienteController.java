package br.com.zitrus.sistema.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String listar(ModelMap model) {
		model.addAttribute("clientes", service.buscarTodos());
		return "/cliente/lista";		
	}
	
	@PostMapping("/salvar")
	public String salvar(Clientes cliente, RedirectAttributes attr) {
		service.salvar(cliente);
		attr.addFlashAttribute("success", "cliente inserido com sucesso");
		return "redirect:/clientes/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("cliente", service.buscarPorId(id));
		return "cliente/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Clientes cliente, RedirectAttributes attr) {
		service.editar(cliente);
		attr.addFlashAttribute("success", "cliente editado com sucesso");
		return "redirect:/clientes/cadastrar";
	}	
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		service.excluir(id);
		attr.addFlashAttribute("success", "cliente removido com sucesso");
		return "redirect:/clientes/listar";		
	}
	
	
}
