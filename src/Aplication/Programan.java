package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Retangulo;

class Programan {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
		
		System.out.println(" Entra com as Medidas do Retangulo :");
		
		x.largura = sc.nextDouble();
		x.altura = sc.nextDouble();
		
		double area = x.area();
		double diagonal = x.diagonal();
		double perimitro = x.perimitro();
		
		
		System.out.printf(" Area é %.2f%n", area);
		System.out.printf(" Perimeter é %.2f%n", perimitro);
		System.out.printf(" Diagonal area é %.2f%n", diagonal);
		
	}
	
}
