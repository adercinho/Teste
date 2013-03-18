package br.com.teste.jenkins;


public class TarefasRules {
	

	/**
	 * Responsável por calcular a tarifa total do produto, de acordo com seu peso, volume e/ou quilometragem.
	 * 
	 * @param isVolume - calculo por volume
	 * @param isPeso -calculo por peso
	 * @param isKm - calculo por km
	 * @param altura - altura do produto em centimetro
	 * @param largura - largura do produto em centimetro 
	 * @param comprimento - comprimento do produto em centimetro
	 * @param peso - peso gramas.
	 * @param km - distância em km
	 * @param pacote - o tipo de pacote(EXPRESSO, NORMAL etc). 
	 * @return o calculo da tarifa referente ao produto
	 */
	public static double tarifa(boolean isVolume, boolean isPeso, boolean isKm, double altura, double largura, double comprimento, double peso, double km, Pacote pacote){
		
		double volume = altura * largura  * comprimento;
		double unidade_vendida = (volume * Math.ceil(peso / 1000) * Math.ceil(km / 20));
		
		double valorTarifa;
		
		if(Pacote.NORMAL == pacote){
			if(isVolume == true && isPeso == true && isKm == true){
			//	valorTarifa = Tarifa.NORMAL.getVlrTarifa() + (unidade_vendida / 1500) * Pacote.NORMAL.getVlrVariavel();
				return 0.0;
			}
			
		}else if(Pacote.EXPRESSO == pacote){
			if(isVolume == true && isPeso == true && isKm == true){
			//	valorTarifa = Tarifa.EXPRESSO.getVlrTarifa() + ( unidade_vendida / 1500 ) * Pacote.EXPRESSO.getVlrVariavel();
				return 0.0;
			}
		}else if(Pacote.ENVELOPE == pacote){
			if(isKm == true){
				return Tarifa.ENVELOPE.getVlrTarifa();
			}
		}
		
		return 0.0;
	}
	
	public static double tarifa(boolean isVolume, boolean isPeso, boolean isKm, double altura, double largura, double comprimento, double peso, Pacote pacote){
		
		double volume = altura * largura  * comprimento;
		double unidade_vendida = (volume * Math.ceil(peso / 1000));
		
		if(Pacote.PROMOCAO == pacote){
			
			if(isVolume == true && isPeso == true && isKm == false){
				double valorTarifa = Tarifa.PROMOCAO.getVlrTarifa() + ( unidade_vendida / 1500 ) * Pacote.PROMOCAO.getVlrVariavel();
				return valorTarifa;
			}
		}
		return 0.0;
	}
	
}
