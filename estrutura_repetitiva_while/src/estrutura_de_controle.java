import java.util.Scanner;

public class estrutura_de_controle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while ( x != 20) {
			x = sc.nextInt();
		}
		
		sc.close();
	}

}
