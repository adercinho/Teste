package br.com.teste.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void calculaValorImpostoDezPorCento() {
		Orcamento orcamento = new Orcamento(100.0);
		assertEquals(10.0, Imposto.calcula(orcamento),0.0);
	}

}
