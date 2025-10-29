package Basico;
import java.util.Scanner;
import java.lang.Math;
public class AreaCirculo {

	public static void main(String[] args) {
		System.out.println("El numero pi: " + Math.PI);
		Scanner entrada = new Scanner(System.in);
		double area;
		double radio;
		
		System.out.print("Ingresa el radio: ");
		radio = entrada.nextDouble();
		
		area= Math.PI * Math.pow(radio, 2);
		System.out.print("El area es: " + area);
		entrada.close();
	}

}
