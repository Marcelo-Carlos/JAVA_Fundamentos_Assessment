package br.edu.infnet.appMateriaisEscolares.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appMateriaisEscolares.model.exception.GarantiaEstendidaException;

@SpringBootTest
public class InformaticaTeste {
	
	@Test
	void testaIntanciaToString() throws GarantiaEstendidaException{
		Informatica informatica = new Informatica("notebook", 3500);
		informatica.setGarantiaEstendida(Boolean.TRUE);
		informatica.setTempoGarantia(10);
		
		assertTrue("notebook;3500.0;true;10".equals(informatica.toString()));
		
	}
	
	@Test
	void testaCalculoValor() throws GarantiaEstendidaException{
		Informatica informatica = new Informatica("notebook", 3500);
		informatica.setGarantiaEstendida(Boolean.TRUE);
		informatica.setTempoGarantia(10);
		
		assertEquals(informatica.calcularValorVenda(), 3600);
		
	}
	
	@Test
	void testaGarantiaEstendidaInvalida() {
		try {
			Informatica informatica = new Informatica("notebook", 3500);
			informatica.setGarantiaEstendida(Boolean.TRUE);
			informatica.setTempoGarantia(10);
			
			
		} catch (GarantiaEstendidaException e) {
			assertEquals("Garantia Inválida.", e.getMessage());
		}
	}
	
	@Test
	void TesteObterValorProduto() throws GarantiaEstendidaException {
		Informatica informatica = new Informatica("notebook", 3500);
		informatica.setGarantiaEstendida(Boolean.TRUE);
		informatica.setTempoGarantia(10);
		
		
		String result = "teclado;3500.0\r";
		
		assertEquals(informatica.obterValorPorProduto(), result);
		
	}

	
	
}
