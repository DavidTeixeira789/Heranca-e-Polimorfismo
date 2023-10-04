package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes>list = new ArrayList<>();
		
		System.out.printf("Insira o número de contribuintes: ");
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println("Dados do contribuinte #"+i+":");
			System.out.print("Pessoa física ou jurídica (f/j)?");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(resp == 'f') {
			System.out.print("Gastos com saúde: ");
			double gastoSaude = sc.nextDouble();
			list.add(new PessoaFisica(nome,rendaAnual,gastoSaude));
			
			}else {
				System.out.print("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome,rendaAnual,numFuncionarios));
			}
		}
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for(Contribuintes ctb : list) {
			System.out.printf("%s: $ %.2f%n",ctb.getNome(), ctb.imposto());
		}
		double sum = 0.0;
		for(Contribuintes ctb : list) {
			sum += ctb.imposto();
		}
		System.out.println();
		System.out.printf("Total dos impostos: $ %.2f",sum);
		
		sc.close();
	}

}
