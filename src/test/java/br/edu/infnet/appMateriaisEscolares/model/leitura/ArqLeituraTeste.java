package br.edu.infnet.appMateriaisEscolares.model.leitura;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArqLeituraTeste {
	
	@Test
	void testaArquivoLeitura() {
		ArquivoLeitura.main(new String[] {"Migração realizada com sucesso."});
	}

}
