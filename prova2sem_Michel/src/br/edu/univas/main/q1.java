package br.edu.univas.main;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
	int notas1[] = new int[10];
	Scanner l = new Scanner(System.in);
	System.out.println("Digite as notas: ");
	for(int i = 0; i<10; i++) {
		notas1[i] = l.nextInt();
	}
	notas1 = atribuicao(notas1);
	int n = verificar(notas1);
	System.out.println("Alunos com nota maior ou igual a 60: "+n);
	l.close();
}
	public static int[] atribuicao(int notas1[]) {
		int notas2[] = new int[20];
		for(int i = 0; i < 10; i++) {
			if(i==0) {
				notas2[i] = notas1[i];
			}else {
				notas2[i+i] = notas1[i];
			}
		}
		for(int i = 0; i< 20; i = i+2) {
			if(notas2[i]<60) {
				notas2[i+1] = 0;
			}else {
				notas2[i+1] = 1;
			}
		}
		return notas2;
	}
	
	public static int verificar(int notas[]) {
		int n = 0;
		for(int i = 1; i< 20; i = i+2) {
			if(notas[i] == 1) {
				n++;
			}else {
				
			}
		}
		return n;
	}
}
