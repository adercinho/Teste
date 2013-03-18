package br.com.teste.jenkins;

public enum Pacote {
	
	

	NORMAL(0.25), EXPRESSO(0.35), PROMOCAO(0.25), ENVELOPE(0.0);
	
	private final double vlrVariavel;
	
	private Pacote(double vlrVariavel){
		this.vlrVariavel = vlrVariavel;
	}

	public double getVlrVariavel() {
		return vlrVariavel;
	}
	
	
}
