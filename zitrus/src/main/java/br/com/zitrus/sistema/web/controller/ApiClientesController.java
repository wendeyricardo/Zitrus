package br.com.zitrus.sistema.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zitrus.sistema.domain.Clientes;
import br.com.zitrus.sistema.service.ClientesService;

@RestController
@RequestMapping("/apiclientes")
public class ApiClientesController {
	
	@Autowired
	private ClientesService service;
	
	@SuppressWarnings("unused")
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<Clientes> init(){
				
		List<Clientes> cliente = this.service.buscarTodos();				
		
		return new ResponseEntity(cliente, HttpStatus.OK);
	}

	

}
