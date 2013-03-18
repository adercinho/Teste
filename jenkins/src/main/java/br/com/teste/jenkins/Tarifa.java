package br.com.teste.jenkins;

public enum Tarifa {
	
	

	NORMAL(25.0), EXPRESSO(30.0), PROMOCAO(45.0), ENVELOPE(18.0);
	
	private final double vlrTarifa;
	
	private Tarifa(double vlrTarifa){
		this.vlrTarifa = vlrTarifa;
	}

	public double getVlrTarifa() {
		return vlrTarifa;
	}
	
}
