package com.program.entites;

public class Usuario {

	private String nome;
	private String cargo;
	private String usuario;
	private String senha;

	public Usuario() {

	}

	public Usuario(String nome, String cargo, String usuario, String senha) {
		this.nome = nome;
		this.cargo = cargo;
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cargo=" + cargo + ", usuario=" + usuario + ", senha=" + senha + "]";
	}

}
