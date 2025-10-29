package Basico;
import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		int resultadoSuma;
		int resultadoResta;
		int resultadoMultiplicacion;
		System.out.print("Dime un numero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Dime otro numero: ");
		num2 = entrada.nextInt();
		
			//esto es para hacer las operaciones 
		resultadoSuma = num1 + num2;
		resultadoResta = num1 - num2;
		resultadoMultiplicacion = num1 * num2;
	
		
			// esto te muestra el resultado de cada uno y el println es para que siga en otra linea "System.out.println"
		System.out.println("Esta es la suma: " + resultadoSuma);
		System.out.println("Esta es la resta: " + resultadoResta);
		System.out.println("Esta es la multiplicacion: " + resultadoMultiplicacion);
		entrada.close();
		 
		//sin variables seria:
		// System.out.printn("La suma es: " + (num1 + num2));
		// System.out.printn("La resta es: " + (num1 - num2))
		// System.out.printn("La multiplicacion es: " + (num1 * num2))
	}

}
