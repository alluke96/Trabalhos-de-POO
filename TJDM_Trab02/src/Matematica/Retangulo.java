package Matematica;

public class Retangulo {
	private static float ladoH, ladoV;
	
	public static void definirLados(float H, float V) {
		ladoH = H;
		ladoV = V;

//		assert H > 0 : "O lado H deve ser positivo!";
//		assert V > 0 : "O lado V deve ser positivo!";
		
		assert H > 0 && V > 0 : "Os lados devem ser positivos!";
	}
	public static float area() {
		float A;
		A = ladoH * ladoV;
		return A;
	}
	
	public static float perimetro() {
		float P;
		P = 2 * (ladoH + ladoV);
		return P;
	}
}
