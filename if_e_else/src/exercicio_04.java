// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

import java.util.Scanner;

public class exercicio_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hri, hrf, resul;
		
		hri = sc.nextInt();
		hrf = sc.nextInt();
		
		if (hri > hrf) {
			resul = (24 - hri) + hrf;
			System.out.println("O jogo durou " + resul + " hora(s)");
		} else if (hri < hrf) {
			resul = hrf - hri;
			System.out.println("O jogo durou " + resul + " hora(s)");
		} else {
			resul = 24;
			System.out.println("O jogo durou " + resul + " hora(s)");
		}
		
		
		
		sc.close();
	}

}
