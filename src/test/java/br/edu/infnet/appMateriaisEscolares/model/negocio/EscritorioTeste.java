package br.edu.infnet.appMateriaisEscolares.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appMateriaisEscolares.model.exception.EnderecoInvalidoException;

@SpringBootTest
public class EscritorioTeste {
	
	@Test
	void testaIntanciaToString() throws EnderecoInvalidoException{
		Escritorio escritorio = new Escritorio("cadeira", 300);
		escritorio.setEntrega(Boolean.TRUE);
		escritorio.setMontagem(Boolean.FALSE);
		escritorio.setEndereco("rua 1, flamengo");
		
		assertTrue("cadeira;300.0;true;false;rua 1, flamengo".equals(escritorio.toString()));
		
	}
	@Test
	void testaCalculoValor() throws EnderecoInvalidoException{
		Escritorio escritorio = new Escritorio("cadeira", 300);
		escritorio.setEntrega(Boolean.FALSE);
		escritorio.setMontagem(Boolean.TRUE);
		escritorio.setEndereco(null);
		
		assertEquals(escritorio.calcularValorVenda(), 450);
		
	}
	
	@Test
	void testaEnderecoInvalido() {
		try {
			Escritorio escritorio = new Escritorio("cadeira", 300);
			escritorio.setEntrega(Boolean.TRUE);
			escritorio.setMontagem(Boolean.FALSE);
			escritorio.setEndereco(null);
		} catch (EnderecoInvalidoException e) {
			assertEquals("Endereço inválido.", e.getMessage());
		}
	}
	
	@Test
	void TesteObterValorProduto() throws EnderecoInvalidoException {
		Escritorio escritorio = new Escritorio("cadeira", 300);
		escritorio.setEntrega(Boolean.TRUE);
		escritorio.setMontagem(Boolean.TRUE);
		escritorio.setEndereco("rua 1, flamengo");;
		
		String result = "cadeira;500.0\r";
		
		assertEquals(escritorio.obterValorPorProduto(), result);
		
	}
	

}
