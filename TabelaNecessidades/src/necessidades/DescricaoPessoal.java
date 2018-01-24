package necessidades;

import java.util.HashMap;

public class DescricaoPessoal {

	public static void main(String args[]) {

		// ESCOLA DE CIENCIAS
		HashMap<String, Integer> hash = LeArquivoUtilPessoas
				.equipamentosMaker("C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalCiencias.txt");
		System.out.println("ESCOLA DE CIÊNCIAS ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ESCOLA DE CIENCIAS DA SAUDE
		hash = LeArquivoUtilPessoas.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalCienciasDaSaude.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ESCOLA DE CIÊNCIAS DA SAUDE ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ESCOLA DE COMUNICACAO
		hash = LeArquivoUtilPessoas
				.equipamentosMaker("C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalComunicação.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ESCOLA DE COMUNICAÇÃO, ARTES E DESIGN ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ESCOLA DE DIREITO
		hash = LeArquivoUtilPessoas
				.equipamentosMaker("C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalDireito.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ESCOLA DE DIREITO ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ESCOLA DE HUMANIDADES
		hash = LeArquivoUtilPessoas
				.equipamentosMaker("C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalHumanidades.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ESCOLA DE HUMANIDADES ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ESCOLA DE MEDICINA
		hash = LeArquivoUtilPessoas
				.equipamentosMaker("C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalMedicina.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ESCOLA DE MEDICINA ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ESCOLA DE NEGOCIOS
		hash = LeArquivoUtilPessoas
				.equipamentosMaker("C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalNegocios.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ESCOLA DE NEGÓCIOS ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ESCOLA POLITÉCNICA
		hash = LeArquivoUtilPessoas
				.equipamentosMaker("C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalPolitecnica.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ESCOLA POLITÉCNICA ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));

		// ASSUNTOS INTERNOS
		hash = LeArquivoUtilPessoas.equipamentosMaker(
				"C:\\Users\\eduardo\\Desktop\\Vinícius\\NecessidadePessoal\\PessoalAssuntosInternos.txt");
		System.out.println("\n##############################################\n");
		System.out.println("ASSUNTOS INTERNOS PUCRS  ");
		System.out.println("Bolsistas de iniciação cientifica e alunos de graduação: "
				+ hash.get("Bolsistas IC/Alunos graduação"));
		System.out.println("Doutorandos e Pós doutorandos: " + hash.get("Doutorandos/Pós doutorandos"));
		System.out.println("Mestrandos: " + hash.get("Mestrandos"));
		System.out.println("Técnicos: " + hash.get("Técnicos"));
		System.out.println("Estagiários : " + hash.get("Estagiários"));
		System.out.println("Outras necessidades de pessoal: " + hash.get("Outras necessidades de pessoal"));
	}

}
