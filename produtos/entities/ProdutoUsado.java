package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFabricação;
	
	public ProdutoUsado(){
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricação) {
		super(nome, preco);
		this.dataFabricação = dataFabricação;
	}
	
	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public Date getDataFabricação() {
		return dataFabricação;
	}

	public void setDataFabricação(Date dataFabricação) {
		this.dataFabricação = dataFabricação;
	}

	@Override
	public String etiquetaPreco() {
		StringBuilder sb = new StringBuilder();
		return super.getNome()+
	    String.format(" (usado) $ %.2f ",super.getPreco())
		+sb.append("(Fabricação: "+sdf.format(dataFabricação)+")");
	}
}
