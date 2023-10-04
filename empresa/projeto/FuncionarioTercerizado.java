package projeto;

public class FuncionarioTercerizado extends Funcionario {
	
	private Double adicional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double adicional) {
		super(nome, horas, valorPorHora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	@Override
	public double pagamento() {
		return super.pagamento() + adicional*1.1;
	}
}
