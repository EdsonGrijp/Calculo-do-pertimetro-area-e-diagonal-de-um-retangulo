package application;

import java.util.Scanner;
import entites.Area;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Area reta = new Area();
		
		System.out.println("Digite os lados do retangulo");
		reta.lado = sc.nextDouble();
		reta.altura = sc.nextDouble();
		
		System.out.println("Area " + reta.arearetangulo());
		System.out.println("Perimetro " + reta.perimetro());
		System.out.println("Diagonal " + reta.diagonal());
		
		sc.close();
	}

}
