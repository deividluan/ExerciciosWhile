package ExercicioTeste;

public class ExercicioWhile7 {
	public static void main (String[]args) {
		int cont= 0;
		int n1 = 0;
		int n2= 1;
		
		while (cont != 15) {
			int n3 = 0;
			n3 = n1 + n2;
			n2 = n1;
			n1 = n3;
			System.out.print(n2 +  " " );
			cont ++;
		}
	}
}

//n1:1, 1, 2, 3, 5, ...
//n2:0, 1, 1, 2, 3, ...
//n3:1, 1, 2, 3, 5, ...