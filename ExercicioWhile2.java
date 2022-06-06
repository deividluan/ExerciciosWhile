package ExercicioTeste;

public class ExercicioWhile2 {
	public static void main (String[]args) {
		
		int numero = 1;
		int zero, tot = 0;
		
		while (numero < 101) {
			tot = tot + numero;
			numero++;
		}
		System.out.println("Resultado: " + tot);
	}

}
