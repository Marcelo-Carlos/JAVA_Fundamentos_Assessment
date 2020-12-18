package br.edu.infnet.appMateriaisEscolares.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTeste {
	
	@Test
	void testaInstancia() {
		Cliente s = null;
		
		s = new Cliente("marcelo", "12342574801", "marcelo.carlos@gmail.com");
		
		assertNotNull(s);
		
	}
	
	@Test
	void testaToString() {
		Cliente s = null;
		
		s = new Cliente("marcelo", "12342574801", "marcelo.carlos@gmail.com");
		
		assertTrue("marcelo;12342574801;marcelo.carlos@gmail.com".equals(s.toString()));
	}
}
