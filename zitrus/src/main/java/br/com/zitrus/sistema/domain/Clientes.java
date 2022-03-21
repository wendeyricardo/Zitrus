package br.com.zitrus.sistema.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "TAB_CLIENTES")
public class Clientes extends AbstractEntity<Long>{
	
	@Column(nullable = false)
	private String nome;
		
	@Column(nullable = false, unique = true)
	private int cpf;
	
	private String sexo;
	
	@Column(nullable = false)
	private String cep; 
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private String rua;
	
	@Column(nullable = false)
	private int numero;
	
	@Column(nullable = false)
	private String estado;	

	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String senha;
	
	@Column(nullable = false)
	private String usuario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
