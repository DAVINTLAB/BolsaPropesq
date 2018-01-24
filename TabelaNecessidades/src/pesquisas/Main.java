package pesquisas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		LeArquivoUtil reader = new LeArquivoUtil();
		// ESCOLA DE DIREITO
		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeDireito.txt");
		Escola estDireito = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeDireitoClean.txt", "Escola de Direito");

		System.out.println(estDireito.toString());

		// ESCOLA DE HUMANIDADES
		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeHumanidades.txt");
		Escola estHumanidades = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeHumanidadesClean.txt", "Escola de Humanidades");

		System.out.println();
		System.out.println(estHumanidades.toString());

		// ESCOLA DE MEDICINA

		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeMedicina.txt");
		Escola estMedicina = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeMedicinaClean.txt", "Escola de Medicina");

		System.out.println();
		System.out.println(estMedicina.toString());

		// ESCOLA DE NEGÓCIOS

		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeNegocios.txt");
		Escola estNegocios = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeNegociosClean.txt", "Escola de Negócios");

		System.out.println();
		System.out.println(estNegocios.toString());

		// ESCOLA DE CIENCIAS DE SAUDE
		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaCienciasDaSaude.txt");
		Escola estCienciasDeSaude = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaCienciasDaSaudeClean.txt",
				"Escola de Ciências da Saúde");

		System.out.println();
		System.out.println(estCienciasDeSaude.toString());

		// ESCOLA DE CIENCIAS
		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeCiencias.txt");
		Escola estCiencias = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeCienciasClean.txt", "Escola de Ciências");

		System.out.println();
		System.out.println(estCiencias.toString());

		// ESCOLA DE COMUNICAÇÃO, ARTES E DESIGN

		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeComunicacaoArtesEDesign.txt");
		Escola estComunicacao = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaDeComunicacaoArtesEDesignClean.txt",
				"Escola de Comunicação, Artes e Design");

		System.out.println();
		System.out.println(estComunicacao.toString());

		// ESCOLA POLITÉCNICA
		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaPolitecnica.txt");
		Escola estPolitecnica = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/EscolaPolitecnicaClean.txt", "Escola Politécnica");

		System.out.println();
		System.out.println(estPolitecnica.toString());

		// ASSUNTOS INTERNOS
		reader.cleanTxt("C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/AssuntosDiversos.txt");
		Escola estDiversos = reader.makeStruct(
				"C:/Users/eduardo/Desktop/Vinícius/TxtsStructs/AssuntosDiversosClean.txt", "Assuntos diversos");

		System.out.println();
		System.out.println(estDiversos.toString());

		//// TESTES
		for (String s : estDiversos.getTemasAtuais()) {

			System.out.println(s);
		}
       
        EstruturaGeral estGeral = new EstruturaGeral();
		
		estGeral.generate("C:\\Users\\eduardo\\Desktop\\Vinícius\\Temas de pesquisa filtrados e editados.txt");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(estGeral.temasFuturosProfessores("ETICA", "ESCOLA DE HUMANIDADES"));
		
		

	}
}