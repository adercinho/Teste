package br.com.teste.jenkins;

public class Imposto {


	public static double calcula(Orcamento orcamento){
		return orcamento.getValor() * 0.1;
	}
}
