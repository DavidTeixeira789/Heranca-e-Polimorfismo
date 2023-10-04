package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas formas você vai digitar ?");
		int N = sc.nextInt();
		
		List<Forma> list = new ArrayList<>();
		
		for(int i = 1; i<=N;i++) {
			System.out.println("Dados da forma #"+i);
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char f = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Color cor = Color.valueOf(sc.next());
			if(f=='r') {
				System.out.print("Altura: ");
				double larg = sc.nextDouble();
				System.out.print("Largura: ");
				double alt = sc.nextDouble();
				
				list.add(new Retangulo(cor,larg,alt));
			}else if(f == 'c') {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				
				list.add(new Circulo(cor,raio));
			}
		}
		System.out.println("AREA DAS FORMAS: ");
		for(Forma f : list) {
			System.out.printf("%.2f%n",f.area());
		}
		
		sc.close();

	}

}
