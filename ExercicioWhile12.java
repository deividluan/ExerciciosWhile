package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile12 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero = 0;
		int cont = 0;
		int maior = 0;
		int menor = 0;
		
		while (numero >= 0) {
			System.out.print("Digite um numero (negativo para parar) : ");
			numero = sc.nextInt();
			
			if (numero < 0) {
				break;
			}
			
			if (cont == 0) {
				maior = numero;
				menor = numero;
			}
			else {
				if (maior < numero) {
					maior = numero;
				}
				if (menor > numero) {
					menor = numero;
				}
			}
			cont ++;
		}
		
		System.out.println("Maior numero: " + maior);
		System.out.print("Menor numero: " + menor);
	}
}