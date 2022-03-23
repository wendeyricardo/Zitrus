package br.com.zitrus.sistema.controller;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AcceptAction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import br.com.zitrus.sistema.service.ClientesService;
import br.com.zitrus.sistema.web.controller.ApiClientesController;
import io.restassured.http.ContentType;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

@WebMvcTest
public class ApiClientesControllerTest {
	
	@Autowired
	private ApiClientesController apliClientesController;
	
	@MockBean
	private ClientesService service;
	
	@BeforeEach
	public void setup() {
		standaloneSetup(this.apliClientesController);
	}
	
	@Test
	public void deveRetornarSucesso_QuandoBuscarClientes() {
		given()
			 .accept(ContentType.JSON)
			 .when()
			 	.get("/apiclientes/")
			 	.then()
			 		.statusCode(HttpStatus.OK.value());
	}
}
