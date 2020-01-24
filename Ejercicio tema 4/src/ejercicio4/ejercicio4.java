package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca el peso (kg): ");
		double peso = sc.nextDouble();
		
		System.out.print("Introduzaca la altura (metros): ");
		double altura = sc.nextDouble();

		
		//double imc = peso / (altura * altura);
		double imc = peso / Math.pow(altura, 2.0);
		//System.out.println("IMC = " + imc);
		
		sc.close();
	}

}
