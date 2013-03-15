package br.com.teste.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void calculaValorImpostoDeSetePorCento() {
		Orcamento orcamento = new Orcamento(100.0);
		Imposto imposto = new Imposto();
		assertEquals(10.0, imposto.calcula(orcamento), Double.MIN_VALUE);
	}

}
