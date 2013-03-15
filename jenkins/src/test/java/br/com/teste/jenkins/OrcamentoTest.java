package br.com.teste.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void calculaValorImpostoDeSetePorCento() {
		Orcamento o = new Orcamento(100.0);
		Imposto imposto = new Imposto();
		double calculaImposto = imposto.calculaImposto(o.getValor());
		assertEquals(7.0, calculaImposto, Double.MIN_VALUE);
	}

}
