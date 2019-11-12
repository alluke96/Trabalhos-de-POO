package Especialista;
import Matematica.Circulo;

public class Arquiteto {
	private static String nome = "Oscar Niermeyer";
	private static int idade = 104;
	
	private static void exibirDadosPessoais () {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
	}
	
	public static void main(String args[]) {
		exibirDadosPessoais();
		System.out.println("Area circulo de raio 5 = " + Circulo.area(5));
		System.out.println("Perimetro circulo de raio 5 = " + Circulo.perimetro(5));		
		Circulo.defineRaio(10);
		System.out.println("Area circulo de raio 10 = " + Circulo.area(10));
		System.out.println("Perimetro circulo de raio 10 = " + Circulo.perimetro(10));	
	}
}
