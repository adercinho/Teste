package br.com.teste.jenkins;

public class Imposto {


	public static double calcula(Orcamento orcamento){
		double resultado = orcamento.getValor() * 0.1;
		return resultado;
	}
}
