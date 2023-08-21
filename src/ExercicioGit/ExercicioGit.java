package ExercicioGit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		int N1, N2, N3, N4, N5, soma;
		
		System.out.println("Digite 5 notas: ");
		N1 = sc.nextInt();
		N2 = sc.nextInt();
		N3 = sc.nextInt();
		N4 = sc.nextInt();
		N5 = sc.nextInt();
		
		
		
        
		List<Integer> notas = new ArrayList<>();
		
		notas.add(N1);
		notas.add(N2);
		notas.add(N3);
		notas.add(N4);
		notas.add(N5);
		
		
		
		soma = N1 + N2 + N3 + N4 + N5;
		System.out.println("A soma das notas é: " + soma);
		
		
		
		
		
		
		
		
		
	}

}
