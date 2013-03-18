package br.com.teste.jenkins;

public class Imposto {


	/**
	 * @param orcamento
	 * @return valor do imposto referente ao orçamento
	 */
	public static double calcula(Orcamento orcamento){
		double resultado = orcamento.getValor() * 0.1;
		return resultado;
	}
}
