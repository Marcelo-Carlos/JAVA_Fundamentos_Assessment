package br.edu.infnet.appMateriaisEscolares.model.negocio;

public abstract class Produto {
	
	private String descricao;
	private float valor;	
	
	public Produto(String descricao, float valor) {
		this.descricao = descricao;
		this.valor = valor;		
	}
	
	public abstract float calcularValorVenda();
	
	public String obterValorPorProduto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r");
		
		return sb.toString();

	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
				
		return sb.toString();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public float getValor() {
		return valor;
	}

}
