package br.com.zitrus.sistema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.zitrus.sistema.dao.ClientesDao;
import br.com.zitrus.sistema.domain.Clientes;

@Transactional(readOnly = true)
@Service
public class ClientesServiceImpl implements ClientesService {
	
	@Autowired
	private ClientesDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Clientes cliente) {
		dao.save(cliente);
		
	}
	@Transactional(readOnly = false)
	@Override
	public void editar(Clientes cliente) {
		dao.update(cliente);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	
	@Override
	public Clientes buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Clientes> buscarTodos() {

		return dao.findAll();
	}

}
