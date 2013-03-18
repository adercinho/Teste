package br.com.teste.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarefaTest {

	@Test
	public void envioPacoteEnvelopeTest() {
		double tarifa = TarefasRules.tarifa(true, true, true, 10, 20, 30, 2380, 45, Pacote.ENVELOPE);
		assertEquals(18.0, tarifa, Double.MIN_VALUE);
	}
	
	
	@Test
	public void envioPacoteNormalTest() {
		double tarifa = TarefasRules.tarifa(true, true, true, 10, 20, 30, 2380, 70, Pacote.NORMAL);
		assertEquals(37.0, tarifa, Double.MIN_VALUE);
	}

	@Test
	public void envioPacotePromocaoTest() {
		double tarifa = TarefasRules.tarifa(true, true, false, 10, 20, 30, 2380, Pacote.PROMOCAO);
		assertEquals(48.0, tarifa, Double.MIN_VALUE);
	}

	@Test
	public void envioPacoteExpressoTest() {
		double tarifa = TarefasRules.tarifa(true, true, true, 10, 20, 30, 2380,70, Pacote.EXPRESSO);
		assertEquals(46.80, tarifa, Double.MIN_VALUE);
	}
}