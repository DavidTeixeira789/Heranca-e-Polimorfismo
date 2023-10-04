package entities;

public class PessoaJuridica extends Contribuintes{
	
	private Integer numFucionarios;
	
	public PessoaJuridica() {
		super();
	}
	

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFucionarios) {
		super(nome, rendaAnual);
		this.numFucionarios = numFucionarios;
	}


	public Integer getNumFucionarios() {
		return numFucionarios;
	}


	public void setNumFucionarios(Integer numFucionarios) {
		this.numFucionarios = numFucionarios;
	}


	@Override
	public double imposto() {
		if(numFucionarios > 10) {
			return getRendaAnual()*0.14;
		}else {
			return getRendaAnual()*0.16;
		}
	}

}
