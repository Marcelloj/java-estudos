// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if ( codigo == 1) {
			total = 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if
			(codigo == 2) {
				total = 4.50 * quantidade;
				System.out.printf("Total: R$ %.2f%n", total);
			} else if ( codigo == 3) {
				total = 5.00 * quantidade;
				System.out.printf("Total: R$ %.2f%n", total);
			} else if (codigo == 4) {
				total = 2.00 * quantidade;
				System.out.printf("Total: R$ %.2f%n", total);
			} else if ( codigo == 5) {
				total = 1.50 * quantidade;
				System.out.printf("Total: R$ %.2f%n", total);
			} else {
				System.out.printf("codigo do produto invalido!!!");
			}
		
		sc.close();
	}

}
