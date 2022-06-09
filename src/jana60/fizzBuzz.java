package jana60;

import java.util.Scanner;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3
		 * stampi Fizz al posto del numero e per i multipli di 5 stampi Buzz. Per i
		 * numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.
		 */

		// Dichiarazione Variabili
		Scanner scan = new Scanner(System.in);
		boolean continuaAChiedere = true;
		int numero = 0;

		// Ciclo While per verificare che il numero inserito sia corretto

		while (continuaAChiedere) {
			System.out.print("Dimmi da 2 a 199 fino a che numero vuoi giocare a FizzBuzz");
			numero = scan.nextInt();
			if (numero > 1 && numero < 200) {
				continuaAChiedere = false;

			} else {
				System.out.println("Hai inserito un numero errato, riprova");

			}

		}
		// Inizio ciclo for per conteggio numeri per FizzBuzz
		for (int i = 1; i <= numero; i++) {
			if ((i % 5) == 0 && (i % 3) == 0) {
				System.out.println("FizzBuzz");
			} else if ((i % 3) == 0) {
				System.out.println("Fizz");

			} else if ((i % 5) == 0) {
				System.out.println("Buzz");

			} else {
				System.out.println(i);

			}
			scan.close();

		}

	}
}
