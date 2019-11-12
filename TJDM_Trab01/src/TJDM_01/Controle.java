package TJDM_01;
import TJDM_01.Semaforo;

public class Controle {
	public static void main(String args[]) {
		System.out.println(Semaforo.imprimeCor());
		
		for(int i = 0; i < 10; i++) {
			Semaforo.mudaProximaCor();
			System.out.println(Semaforo.imprimeCor());
		}
		
		Semaforo.mudaCorFixa(1);
		System.out.println(Semaforo.imprimeCor());
	}
}
