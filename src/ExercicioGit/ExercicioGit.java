package ExercicioGit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> notas = lerNotas();

		int soma = somarNotas(notas);
		System.out.println("A soma das notas é: " + soma);

		double media = calcularMedia(notas);
		System.out.println("A média das notas é: " + media);

		int contadorNotasMenoresQue6 = contarNotasMenoresQue6(notas);
		System.out.println("Quantidade de notas menores que 6: " + contadorNotasMenoresQue6);
	}

	public static List<Integer> lerNotas() {
		List<Integer> notas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
			int nota = scanner.nextInt();
			notas.add(nota);
		}

		return notas;
	}

	public static int somarNotas(List<Integer> notas) {
		int soma = 0;

		for (int nota : notas) {
			soma += nota;
		}

		return soma;
	}

	public static double calcularMedia(List<Integer> notas) {
		int soma = somarNotas(notas);
		return (double) soma / notas.size();
	}

	public static int contarNotasMenoresQue6(List<Integer> notas) {
		int contador = 0;

		for (int nota : notas) {
			if (nota < 6) {
				contador++;
			}
		}

		return contador;

	}

	public static double encontrarMenorNota(List<Double> notas) {
		double menorNota = notas.get(0);

		for (double nota : notas) {
			if (nota < menorNota) {
				menorNota = nota;
			}
		}

		return menorNota;
	}

	public static double encontrarMaiorNota(List<Double> notas) {
		double maiorNota = notas.get(0);

		for (double nota : notas) {
			if (nota > maiorNota) {
				maiorNota = nota;
			}
		}

		return maiorNota;
	}
}
