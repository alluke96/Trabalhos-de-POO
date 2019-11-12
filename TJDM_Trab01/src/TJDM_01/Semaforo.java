package TJDM_01;

public class Semaforo {
	
	// 0 - Verde | 1 - Amarelo | 2 - Vermelho //
	static int cor = 2;
	
	public static String imprimeCor() {
		String nomeCor = "";		
		switch(cor) {
		case 0:	nomeCor = "VERDE";  	break;
		case 1:	nomeCor = "AMARELO";	break;
		case 2:	nomeCor = "VERMELHO";	break;
		}
		return nomeCor;
	}

	public static void mudaProximaCor() {
		if (cor == 2) cor = 0; 
		else cor++;	
	}
	public static void mudaCorFixa(Integer cor_atual) {
		cor = cor_atual;
	}
	
	public int mostraCor() {
		return cor;
	}
}
