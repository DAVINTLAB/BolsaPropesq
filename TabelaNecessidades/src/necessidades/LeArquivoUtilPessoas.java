package necessidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LeArquivoUtilPessoas {
	public static HashMap<String, Integer> equipamentosMaker(String arquivo) {
		String linha = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(arquivo));

			while (br.ready()) {
				linha = linha + br.readLine().toUpperCase();

			}

			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		HashMap<String, Integer> hash = new HashMap<>();
		hash.put("Doutorandos/Pós doutorandos", 0);
		hash.put("Bolsistas IC/Alunos graduação", 0);
		hash.put("Mestrandos", 0);
		hash.put("Técnicos", 0);
		hash.put("Estagiários", 0);

		String vet[] = linha.split("&");
		boolean flag;
		int valueAux;
		int cont = 0;
		int contAux = 0;
		String line;
		for (int i = 0; i < vet.length; i++) {
			line = vet[i];
			flag = false;
			if (line.length() > 3)
				cont++;
			if (line.contains("DOUTORADO") || line.contains("DOC") || line.contains("DOUTORANDO")) {
				valueAux = hash.get("Doutorandos/Pós doutorandos");
				valueAux++;
				hash.replace("Doutorandos/Pós doutorandos", valueAux);
				contAux++;
				flag = true;
			}
			if (line.contains("BOLSISTA") || line.contains("ALUNO") || line.contains("IC")
					|| line.contains("INICIAÇAO")) {
				valueAux = hash.get("Bolsistas IC/Alunos graduação");
				valueAux++;
				hash.replace("Bolsistas IC/Alunos graduação", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;
			}
			if (line.contains("MESTRADO") || line.contains("MESTRANDOS")) {
				valueAux = hash.get("Mestrandos");
				valueAux++;
				hash.replace("Mestrandos", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;
			}

			if (line.contains("TECNICO")) {
				valueAux = hash.get("Mestrandos");
				valueAux++;
				hash.replace("Técnicos", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;
			}
			
			if (line.contains("ESTAGIO") || line.contains("ESTAGIARIO")) {
				valueAux = hash.get("Estagiários");
				valueAux++;
				hash.replace("Estagiários", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;
			}

		}
		hash.put("Outras necessidades de pessoal", (cont - contAux));
		return hash;
	}
}
