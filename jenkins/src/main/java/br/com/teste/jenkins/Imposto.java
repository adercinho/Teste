package br.com.teste.jenkins;

public class Imposto {


	public double calcula(Orcamento orcamento){
		return orcamento.getValor() * 0.10;
	}
}
