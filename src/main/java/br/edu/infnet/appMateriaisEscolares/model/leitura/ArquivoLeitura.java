package br.edu.infnet.appMateriaisEscolares.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.appMateriaisEscolares.model.exception.EnderecoInvalidoException;
import br.edu.infnet.appMateriaisEscolares.model.exception.GarantiaEstendidaException;
import br.edu.infnet.appMateriaisEscolares.model.exception.QuantidadeInvalidaException;
import br.edu.infnet.appMateriaisEscolares.model.negocio.Escritorio;
import br.edu.infnet.appMateriaisEscolares.model.negocio.Informatica;
import br.edu.infnet.appMateriaisEscolares.model.negocio.Papelaria;

public class ArquivoLeitura {
	
	public static void main(String[] args) {
		
		String dir = "C:/dev/workspace/";
		String arq = "pedidos.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arq);
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arq);			
			BufferedWriter out = new BufferedWriter(escrita);

			String linha = in.readLine();
			
			while(linha != null) {
				
				String[] campos = linha.split(";");
				
				
				switch (campos[0].toUpperCase()) {
				case "P":
					Papelaria papelaria = new Papelaria(campos[1], Float.valueOf(campos[2]));
					papelaria.setQuantidade(Float.valueOf(campos[3]));
					papelaria.setMarca(campos[4]);
					
					out.write(papelaria.obterValorPorProduto());
					break;

				case "I":
					Informatica informatica = new Informatica(campos[1], Float.valueOf(campos[2]));
					informatica.setGarantiaEstendida(Boolean.valueOf(campos[3]));
					informatica.setTempoGarantia(Integer.valueOf(campos[4]));

					out.write(informatica.obterValorPorProduto());					
					break;

				case "E":
					Escritorio escritorio = new Escritorio(campos[1], Float.valueOf(campos[2]));
					escritorio.setEntrega(Boolean.valueOf(campos[3]));
					escritorio.setMontagem(Boolean.valueOf(campos[4]));
					escritorio.setEndereco(campos[5]);
					
					out.write(escritorio.obterValorPorProduto());
					break;
					
				default:
					break;
				}

				linha = in.readLine();
			}

			in.close();
			leitura.close();
			
			out.close();
			escrita.close();
			
			System.out.println(args.length == 1 ? args[0] : "Pronto!!");
			
		} catch (IOException| EnderecoInvalidoException | GarantiaEstendidaException e) {
			System.out.println(e.getMessage());
		}
	}
		
}
