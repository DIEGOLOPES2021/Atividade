package br.com.academia;

import java.time.LocalDate;

import br.com.academia.model.NivelDeAtividade;
import br.com.academia.model.Pessoa;

public class App {

	public static void main(String[] args) {
		Pessoa ana =new Pessoa();
		ana.setNome("Ana");
		ana.setSexo('M');
		ana.setPeso(70);
		ana.setAltura(1.73);
		ana.setDataNascimento(LocalDate.of(2004, 3, 26));
		ana.setNivelDeAtividade(NivelDeAtividade.MODERADO);
		System.out.println("Nome:"+ana.getNome());
		System.out.println("Idade:" + ana.getIdade());
		System.out.println("Imc:"+ ana.getImc());
		System.out.println("Imc:"+ ana.getStatusImc());
		System.out.println("Ncd:"+ ana.getNcd());

//		ana.setNivelDeAtividade(NivelDeAtividade.MODERADO);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
