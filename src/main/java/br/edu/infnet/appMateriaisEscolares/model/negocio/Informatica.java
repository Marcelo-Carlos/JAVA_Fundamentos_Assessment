package br.edu.infnet.appMateriaisEscolares.model.negocio;

import br.edu.infnet.appMateriaisEscolares.model.exception.GarantiaEstendidaException;

public class Informatica extends Produto{
	
	private boolean garantiaEstendida;	
	private int tempoGarantia;
	
	public Informatica(String descricao, float valor) {
		super(descricao, valor);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isGarantiaEstendida());
		sb.append(";");
		sb.append(this.getTempoGarantia());
		
		return sb.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		
		return this.getValor() + (this.isGarantiaEstendida() ? 10 * this.tempoGarantia : 0);
	}
	
	public boolean isGarantiaEstendida() {
		return garantiaEstendida;
	}

	public void setGarantiaEstendida(boolean garantiaEstendida) {
		this.garantiaEstendida = garantiaEstendida;
	}

	public int getTempoGarantia() {
		return tempoGarantia;
	}

	public void setTempoGarantia(int tempoGarantia) throws GarantiaEstendidaException {
		
		if (garantiaEstendida == true && tempoGarantia <= 0 | tempoGarantia > 24) {
			throw new GarantiaEstendidaException("Garantia estendida inválida.");
			
		}
		this.tempoGarantia = tempoGarantia;
	}

}
