package br.edu.infnet.appMateriaisEscolares.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

@SpringBootTest
public class PedidoTeste {
	
	@Test
	void testaAssociacao() {
		Cliente cliente = new Cliente("marcelo", "12325874145", "marcelo.carlos@gmail.com");
		
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		
		assertTrue(pedido.isWeb());
	}
	
	@Test
	void testaBalcao() {
		Cliente cliente = new Cliente("marcelo", "12325874145", "marcelo.carlos@gmail.com");
		
		Pedido pedido = new Pedido();
		pedido.setWeb(Boolean.FALSE);
		pedido.setCliente(cliente);
		
		assertFalse(pedido.isWeb());
	}
	
	@Test
	void testaToString() {
		Cliente cliente = new Cliente("marcelo", "12325874145", "marcelo.carlos@gmail.com");
		
		Pedido pedido = new Pedido();
		pedido.setWeb(Boolean.FALSE);
		pedido.setCliente(cliente);
		
		DateTimeFormatter formatoHoje = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime hoje = LocalDateTime.now();
		
		String textoPedido = hoje.format(formatoHoje)+";false;marcelo;12325874145;marcelo.carlos@gmail.com";
		
		assertTrue(textoPedido.equals(pedido.toString()));
	}

}
