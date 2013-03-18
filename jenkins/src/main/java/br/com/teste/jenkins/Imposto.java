package br.com.teste.jenkins;

public class Imposto {


	/**
	 * O calculo do imposto retorna 10% do valor do orçamento
	 * @param orcamento
	 * @return valor do imposto referente ao orçamento
	 */
	public static double calcula(Orcamento orcamento){
		double resultado = orcamento.getValor() * 0.1;
		return resultado;
	}
}
