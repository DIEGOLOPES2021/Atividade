package br.com.academia.model;

public class Pessoa {
	
	private String nome;
	private double peso;
	private double altura;
	private char sexo;
	private int nivelDeAtividade;


	
	//*set e get nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	
	
	//*set e get peso
	public  void setPeso(double peso) {
		 this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	
	
	
	//**set e get altura
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	
	
	
	
	//**set e get sexo
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return this.sexo;
	}
	
	
	
	//**set e get nivelDeAtividade
	public void setNivelDeAtividade(int nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
	}
	public int getNivelDeAtividade() {
		return this.sexo;
	}



}

