package act2;

import java.util.Scanner;

public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el radio: ");
		double radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2.0 );
		System.out.println("Area =  " + area);
		System.out.printf("Area = %.2f %n",area);
	}
}
		