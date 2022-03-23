package br.com.zitrus.sistema.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zitrus.sistema.domain.Clientes;


public interface ClientesDao extends JpaRepository<Clientes, Long>{

}
