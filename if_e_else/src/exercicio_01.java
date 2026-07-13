// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não negativo.

import java.util.Scanner;

public class exercicio_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		n1 = sc.nextInt();
		
		if (n1 >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO!");
		}
		
		sc.close();
	}

}
