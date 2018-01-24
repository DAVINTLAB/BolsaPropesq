package necessidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DescricaoEquipamentos {

	public static void main(String args[]) {

		// ESCOLA DE CIENCIAS
		LeArquivoUtilEquip reader;
		HashMap<String, Integer> hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosCiencias.txt");
		System.out.println("ESCOLA DE CIÊNCIAS ");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ESCOLA DE CIENCIAS DA SAUDE
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosCienciasDaSaude.txt");
		System.out.println("ESCOLA DE CIENCIAS DA SAÚDE");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ESCOLA DE COMUNICAÇÃO
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosComunicacao.txt");
		System.out.println("ESCOLA DE COMUNICAÇÃO");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ESCOLA DE DIREITO
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosDireito.txt");
		System.out.println("ESCOLA DE DIREITO ");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ESCOLA DE HUMANIDADES
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosHumanidades.txt");
		System.out.println("ESCOLA DE HUMANIDADES");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ESCOLA DE MEDICINA
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosMedicina.txt");
		System.out.println("ESCOLA DE MEDICINA ");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ESCOLA DE NEGOCIOS
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosNegocios.txt");
		System.out.println("ESCOLA DE NEGÓCIOS");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ESCOLA POLITECNICA
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosPolitecnica.txt");
		System.out.println("ESCOLA POLITECNICA ");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));

		// ASSUNTOS INTERNOS

		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosAssuntosInternos.txt");
		System.out.println("ASSUNTOS INTERNOS");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));
		
		System.out.println("####################################");
		hash = LeArquivoUtilEquip.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadeEquipamentos\\EquipamentosGeral.txt");
		System.out.println("ESCOLA GERAL ");
		System.out.println("Computadores pessoais: " + hash.get("Computador Pessoal"));
		System.out.println("Servidores: " + hash.get("Servidor"));
		System.out.println("Equipamentos de vídeo: " + hash.get("Equipamento de vídeo"));
		System.out.println("Microscópios: " + hash.get("Microscópio"));
		System.out.println("Equipamentos de áudio : " + hash.get("Equipamento de áudio"));
		System.out.println("Equipamentos de cópia : " + hash.get("Equipamento de cópia"));
		System.out.println("Outros equipamentos: " + hash.get("Outros equipamentos"));
		
		
		
	
		
		

	}
}
