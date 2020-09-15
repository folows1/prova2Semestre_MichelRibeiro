package br.edu.univas.main;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.println("Digite a String");
		String palavra = l.nextLine();
		int t = palavra.length();
		String inverso = inverter(palavra, t);
		System.out.println(inverso);
		l.close();
	}

	public static String inverter(String p, int t) {
		String nova = "";
		for (int i = t - 1; i >= 0; i--) {
			nova = nova + p.charAt(i);
		}
		return nova;
	}
}
