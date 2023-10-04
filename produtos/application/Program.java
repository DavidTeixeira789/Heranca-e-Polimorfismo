package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImport;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> prod = new ArrayList<>();
		System.out.print("Quantidade de produtos ?");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Produto #"+i);
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char resp = sc.next().charAt(0);
			System.out.print("nome ");
			String nome = sc.next();
			System.out.print("preço ");
			double preco = sc.nextDouble();
			if(resp == 'i') {
			System.out.print("taxa ");
			double taxa = sc.nextDouble();
			Produto pd = new ProdutoImport(nome,preco,taxa);
			prod.add(pd);
			}else if(resp == 'c') {
				Produto pd = new Produto(nome,preco);
				prod.add(pd);
			}else {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				String data = sc.next();
			Produto pd = new ProdutoUsado(nome, preco,sdf.parse(data));
			prod.add(pd);
			}
		}
		System.out.println("Etiquetas de preço: ");
		for(Produto pd : prod) {
			System.out.println(pd.etiquetaPreco());
		}
		sc.close();
	}

}
