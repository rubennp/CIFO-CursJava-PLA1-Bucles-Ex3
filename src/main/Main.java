package main;

import java.util.Scanner;

public class Main {

	/*
	 * Demana un número > 1.
	 * Ens diu la suma de tots els números fins a l'introduït.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introdueix un número més gran d'1:");
		int num = in.nextInt();
		
		while (num <= 1) {
			System.out.println("Si us plau, el número ha de ser superior a 1:");
			num = in.nextInt();
		}
		
		int suma = 0;
		
		for (int n = 1; n <= num; n++) suma += n;
		
		System.out.println("La suma de tots els números fins al " + num + " és: " + suma);
		
		in.close();
	}

}
