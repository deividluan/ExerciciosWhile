package ExercicioTeste;

public class ExercicioWhile10 {
	public static void main (String[]args) {
		
		int cont = 50;
		int soma = 0;
		int media = 0;
		
		while (cont != 71) {
			
			if (cont % 2 == 0) {
				soma += cont;
			}
			cont ++;
		}
		
		System.out.println("A soma de todos os pares entre 50 e 70 �: " + soma);
		
		media = soma / 20;
		System.out.print("A m�dia de todos os pares entre 50 e 70 �: " + media);
	}
}
