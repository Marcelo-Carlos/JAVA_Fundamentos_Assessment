package br.edu.infnet.appMateriaisEscolares.model.negocio;

import br.edu.infnet.appMateriaisEscolares.model.exception.EnderecoInvalidoException;

public class Escritorio extends Produto {
	
	private boolean entrega;
	private boolean montagem;
	private String endereco;
	
	
	public Escritorio(String descricao, float valor) {
		super(descricao, valor);
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isEntrega());
		sb.append(";");
		sb.append(this.isMontagem());
		sb.append(";");
		sb.append(this.getEndereco());
		
		return sb.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		
		return this.getValor() + (this.isEntrega() ? 50 : 0) + (this.isMontagem() ? 150 : 0);
	}
	
	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

	public boolean isMontagem() {
		return montagem;
	}

	public void setMontagem(boolean montagem) {
		this.montagem = montagem;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) throws EnderecoInvalidoException {
		
		if (entrega == true && endereco == null) {
			throw new EnderecoInvalidoException("Favor preencher o endereço.");
			
		}
		this.endereco = endereco;
	}


	
}
