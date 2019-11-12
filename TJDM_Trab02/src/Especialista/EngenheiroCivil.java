package Especialista;

import Matematica.Retangulo;

public class EngenheiroCivil {
	private static String nome = "Oscar Niermeyer";
	private static int idade = 104;

	private static void exibirDadosPessoais () {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	public static void main(String args[]) {
		try {
			exibirDadosPessoais();
			Retangulo.definirLados(-4.7f, 8.2f);

			System.out.println("Area = " + Retangulo.area());
			System.out.println("Perimetro = " + Retangulo.perimetro());
		} catch(AssertionError e) {
			System.out.println("EXCECAO: " +  e.getMessage());
		}
	}
}
