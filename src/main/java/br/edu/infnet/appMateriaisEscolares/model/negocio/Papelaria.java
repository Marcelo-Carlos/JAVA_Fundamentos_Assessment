package br.edu.infnet.appMateriaisEscolares.model.negocio;

public class Papelaria extends Produto{
	
	private float quantidade;
	private String marca;
	
	public Papelaria(String descricao, float valor) {
		super(descricao, valor);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getMarca());
		sb.append(";");
		sb.append(this.getQuantidade());
		
		return sb.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		
		return this.getValor() * this.getQuantidade();
	}
	
	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
