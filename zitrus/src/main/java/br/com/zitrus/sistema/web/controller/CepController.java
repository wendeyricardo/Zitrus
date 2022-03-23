package br.com.zitrus.sistema.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import br.com.zitrus.sistema.domain.Cep;
import br.com.zitrus.sistema.domain.Clientes;

@Controller
@RequestMapping("/cep")
public class CepController {
	
	 private static final String URL = "https://opencep.com/v1";	
	 
	  @GetMapping(value = "/{cep}")
	    public ModelAndView buscarEnderecoPorCep(@PathVariable(name = "cep") String cep) {

	        String cepSemSimbolos = cep.replaceAll("\\D", "");

	        	RestTemplate restTemplate = new RestTemplate();
	        	Cep cepRetornoApi =  restTemplate.getForObject(URL, Cep.class, cepSemSimbolos);
	        	Clientes cliente = new Clientes();
	        	System.out.println(cepRetornoApi);
	        	
	        	cliente.setCep(cepRetornoApi.getCep());
	        	cliente.setRua(cepRetornoApi.getLogradouro());
	        	cliente.setCidade(cepRetornoApi.getLocalidade());
	        	cliente.setEstado(cepRetornoApi.getUf());

	        	
	        	ModelAndView mv = new ModelAndView("cliente/cadastro");
	        	mv.addObject(cliente);
	           return mv; 
	           
	        }
}