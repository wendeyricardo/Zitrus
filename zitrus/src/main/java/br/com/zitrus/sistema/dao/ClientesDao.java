package br.com.zitrus.sistema.dao;

import java.util.List;

import br.com.zitrus.sistema.domain.Clientes;

public interface ClientesDao {

	void save(Clientes clientes);
	
	void update(Clientes clientes);
	
	void delete(Long id);
	
	Clientes findById (Long id);
	
	List<Clientes> findAll();
}
