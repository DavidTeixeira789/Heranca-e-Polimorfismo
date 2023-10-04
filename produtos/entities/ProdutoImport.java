package entities;

public class ProdutoImport extends Produto {
	
	private Double taxaAlfandega;
	
	public ProdutoImport() {
		
	}
	
	public ProdutoImport(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public double total() {
		return preco + taxaAlfandega;
	}
	@Override
	public String etiquetaPreco() {
		StringBuilder sb = new StringBuilder();
		return super.getNome()+String.format(" $ %.2f",total())
		+sb.append(" (Taxa da alfandega: $ "
		+String.format("%.2f",taxaAlfandega)+")");
	}

}
