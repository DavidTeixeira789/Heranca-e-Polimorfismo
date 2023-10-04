package entities;

public class PessoaFisica extends Contribuintes {
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double taxaBasic = (getRendaAnual() < 20000.00) ? getRendaAnual()*0.15 : getRendaAnual()*0.25;
		taxaBasic = taxaBasic - (getGastoSaude()*0.5);
		if(taxaBasic < 0.0) {
			return 0.0;
		}
		return taxaBasic;
	}

}
