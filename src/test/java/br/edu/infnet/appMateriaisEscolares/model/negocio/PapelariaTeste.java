package br.edu.infnet.appMateriaisEscolares.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appMateriaisEscolares.model.exception.QuantidadeInvalidaException;

@SpringBootTest
public class PapelariaTeste {
	
	@Test
	void testaIntanciaToString() throws QuantidadeInvalidaException{
		Papelaria papelaria = new Papelaria("caderno", 15);
		papelaria.setMarca("cadernoSA");
		papelaria.setQuantidade(10);
		
		assertTrue("caderno;15.0;10;cadernoSA".equals(papelaria.toString()));	
	}
	
	@Test
	void testaCalculoValor() throws QuantidadeInvalidaException{
		Papelaria papelaria = new Papelaria("caderno", 15);
		papelaria.setMarca("cadernoSA");
		papelaria.setQuantidade(10);
		
		assertEquals(papelaria.calcularValorVenda(), 150);
	}
	
	@Test
	void testaQuantidadeInvalida() {
		Papelaria papelaria = new Papelaria("caderno", 15);
		papelaria.setMarca("cadernoSA");
		papelaria.setQuantidade(10);
	}
	
	@Test
	void TesteObterValorProduto() throws QuantidadeInvalidaException {
		Papelaria papelaria = new Papelaria("caderno", 15);
		papelaria.setMarca("cadernoSA");
		papelaria.setQuantidade(10);
		
		String result = "caderno;15.0\r";
		
		assertEquals(papelaria.obterValorPorProduto(), result);
		
	}
}
