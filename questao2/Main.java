package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tamanhoSenha;
		String senha;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma senha: ");

		senha = teclado.next(); // ler input
		tamanhoSenha = senha.length();

		if (tamanhoSenha < 6) { // se for menor que 6 imprimir a diferenca
			System.out.println(6 - tamanhoSenha);
		} else {
			System.out.println("Ok!"); // se maior ou igual à 6
		}
		teclado.close();

	}
}
