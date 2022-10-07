package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = tc.nextInt();
		
		float[] num = new float[n];
		float soma = 0;
		float media = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = tc.nextFloat();
			soma += num[i];
			media = soma / num.length;
		}
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.print("MEDIA = " + media);
	}

}
