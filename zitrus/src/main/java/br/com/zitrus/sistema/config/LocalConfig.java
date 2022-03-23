package br.com.zitrus.sistema.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.zitrus.sistema.domain.Clientes;
import br.com.zitrus.sistema.service.ClientesService;

@Configuration
@Profile("local")
public class LocalConfig {
	
	@Autowired
	ClientesService dao;

	@Bean
	public void startDB() {
		Clientes c1 = new Clientes();
		c1.setNome("Zitrus");
		c1.setCpf(123456);
		c1.setCidade("Joinville ");
		c1.setEmail("wendey@zitrus.com");
		c1.setCep("89203210");
		c1.setEndereco("Atiradores");
		c1.setEstado("SC");
		c1.setNumero(54);
		c1.setUsuario("zitrino");
		c1.setSenha("venhaserfeliz");
		c1.setSexo("Masculino");
		c1.setRua("Xavantes");
		dao.salvar(c1);
	}
}
