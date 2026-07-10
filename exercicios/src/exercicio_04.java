// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, qnt1, qnt2;
		double valor1, valor2, total;
		
		peca1 = sc.nextInt();
		qnt1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		peca2 = sc.nextInt();
		qnt2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = valor1 * qnt1 + valor2 * qnt2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}
