// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, hr;
		double sl;
		
		
		n1 = sc.nextInt();
		hr = sc.nextInt();
		sl = sc.nextDouble();
		
		double salary;
		salary = hr * sl;
		
		System.out.println("Number = " + n1);
		System.out.printf("Salary U$ %.2f%n ", salary);
		
		sc.close();
	}

}
