package ExercicioTeste;

public class ExercicioWhile3 {
	public static void main (String[]args) {
		
		 int numero = 2;
		 int tot = 0;
		 
		 while (numero < 501) {
			 tot += numero;;
			 numero ++; 
			 numero ++;
		 }
		 System.out.println("Soma de todos os pares: " + tot);
	}
}
