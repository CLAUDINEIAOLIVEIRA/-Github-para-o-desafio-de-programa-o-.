package questao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String input;
		int x, y, n;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite n = x, onde x � o numero de escadas");
		input = teclado.nextLine();

		if (input.contains("=")) { // olha se o usuario digitou n = x;
			n = Integer.parseInt(input.substring(input.indexOf('=') + 2)); // Index depois do igual e do espa�o
			n--;
		} else { // se digitou somente o numero vai por aqui
			n = Integer.parseInt(input);
			n--;
		}

		for (x = 0; x <= n; x++) { // fazendo escada
			for (y = n; y >= 0; y--) {
				if (y > x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // quebra de linha
		}
		teclado.close(); // encerrando scanner
	}
}
