package br.com.zitrus.sistema.service;

import java.util.List;

import br.com.zitrus.sistema.domain.Clientes;

public interface ClientesService {
	
	void salvar(Clientes cliente);
	
	void editar(Clientes cliente);
	
	void excluir(Long id);
	
	Clientes buscarPorId(Long id);
	
	List<Clientes> buscarTodos();

}
