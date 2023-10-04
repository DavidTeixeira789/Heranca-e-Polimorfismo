package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projeto.Funcionario;
import projeto.FuncionarioTercerizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		List<Funcionario> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			System.out.println("Dados do funcionário #" + i + " :");
			System.out.print("Tercerizado (s/n)?");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if(resp == 's') {
				System.out.print("Adiconal: ");
				double adicional = sc.nextDouble();
				Funcionario emp = new FuncionarioTercerizado(nome,horas,valorPorHora,adicional);
				list.add(emp);
			}else {
				Funcionario emp = new Funcionario(nome,horas,valorPorHora);
				list.add(emp);
			}

		}
		System.out.println("PAGAMENTOS:");
		for(Funcionario emp : list) {
			System.out.println(emp.getNome()+" - $ "+String.format("%.2f",emp.pagamento()));
		}

		sc.close();

	}

}
