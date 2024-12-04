package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do " + "%d" + "o aluno:%n", i + 1);
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Product(name, nota1, nota2);

		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if(vect[i].getMedia() >= 6 ) {
				System.out.println(vect[i].getName());
			}
			
			}
		
		sc.close();
	}
}
