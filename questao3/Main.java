package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String palavra;

		System.out.print("Digite a palavra: ");
		palavra = teclado.nextLine();

		System.out.println("Numero de pares: " + olharAnagramas(palavra));

		teclado.close();

	}

	public static boolean eAnagrama(String string1, String string2) { // verificando

		if (string1.length() != string2.length()) { // se o tamanho for diferente retorna falso
			return false;
		}
		int x, y, cont = 0;

		boolean[] visitado = new boolean[string2.length()];

		for (x = 0; x < string1.length(); x++) {

			for (y = 0; y < string2.length(); y++) {

				if (string1.charAt(x) == string2.charAt(y) && !visitado[y]) {
					cont++;
					visitado[y] = true;
					break;
				}
			}
		}
		return cont == string2.length() ? true : false; // retornando se tem
	}

	static int olharAnagramas(String palavra) {
		List<String> lista = new ArrayList<>(); // lista de todas substrings
		int x, y;

		int resposta = 0; // qt de anagramas

		for (x = 0; x < palavra.length(); x++) {
			for (y = x + 1; y <= palavra.length(); y++) {
				lista.add(palavra.substring(x, y));
			}
		}
		for (x = 0; x < lista.size(); x++) {
			for (y = x + 1; y < lista.size(); y++) {
				if (eAnagrama(lista.get(x), lista.get(y))) { // se for incrementa nos pares
					resposta++;
				}
			}
		}
		return resposta;
	}
}
