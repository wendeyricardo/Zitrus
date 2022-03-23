package br.com.zitrus.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zitrus.sistema.dao.ClientesDao;
import br.com.zitrus.sistema.domain.Clientes;

@Service
public class ClientesService {

	@Autowired
	private ClientesDao dao;

	public void salvar(Clientes cliente) {
		dao.save(cliente);
	}

	public void excluir(Long id) {
		dao.deleteById(id);

	}

	public Clientes buscarPorId(Long id) {

		return dao.findById(id).get();
	}

	public List<Clientes> buscarTodos() {

		return dao.findAll();
	}
}
