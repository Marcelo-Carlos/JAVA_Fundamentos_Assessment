package br.edu.infnet.appMateriaisEscolares.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTeste {
	
	@Test
	void testaEscritorio() {
		Escritorio escritorio = null;
		
		escritorio = new Escritorio("Papel", 45);		
		assertNotNull(escritorio);		
	}
	
	@Test
	void testaInformatica() {
		Informatica informatica = null;
		
		informatica = new Informatica("HD", 1500);
		assertNotNull(informatica);
		
	}
	
	@Test
	void testaPapelaria() {
		Papelaria papelaria = null;
		
		papelaria = new Papelaria("Papel", 150);
		assertNotNull(papelaria);
	}
}
