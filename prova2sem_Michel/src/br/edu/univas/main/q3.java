package br.edu.univas.main;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.println("Digite a String");
		String p = l.nextLine();
		l.close();
		if(palind(p)) {
			System.out.println("É palíndromo!");
		}else {
			System.out.println("Não é palíndromo!");
		}
	}
	
	public static boolean palind(String p) {
		if(p.length() == 0 || p.length() == 1) {
            return true; 
		}
		if(p.charAt(0) == p.charAt(p.length()-1)) {
			return palind(p.substring(1, p.length()-1));
			
	}
		return false;
		
		//* ESSA EU PESQUISEI BASTANTE PRA CONSEGUIR TERMINAR, NÃO SEI SE VALE!
}}
