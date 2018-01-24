package necessidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LeArquivoUtilEquip {

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
		hash.put("Computador Pessoal", 0);
		hash.put("Servidor", 0);
		hash.put("Equipamento de vídeo", 0);
		hash.put("Microscópio", 0);
		hash.put("Equipamento de áudio", 0);
		hash.put("Equipamento de cópia", 0);

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
			if (line.contains("COMPUTADOR") || line.contains("DESKTOP") || line.contains("NOTEBOOK")
					|| line.contains("LAPTOP") || line.contains("PC")) {
				valueAux = hash.get("Computador Pessoal");
				valueAux++;
				hash.replace("Computador Pessoal", valueAux);
				contAux++;
				flag = true;
			}
			if (line.contains("SERVIDOR")) {
				valueAux = hash.get("Servidor");
				valueAux++;
				hash.replace("Servidor", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;
			}
			if (line.contains("CAMERA") || line.contains("FILMADORA") || line.contains("FOTOGRAFICA")) {
				valueAux = hash.get("Equipamento de vídeo");
				valueAux++;
				hash.replace("Equipamento de vídeo", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;
			}
			if (line.contains("MICROSCOPIO")) {
				valueAux = hash.get("Microscópio");
				valueAux++;
				hash.replace("Microscópio", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;
			}
			if (line.contains("GRAVADOR") || line.contains("MICROFONE")) {
				valueAux = hash.get("Equipamento de áudio");
				valueAux++;
				hash.replace("Equipamento de áudio", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;

			}
			if (line.contains("SCANNER") || line.contains("IMPRESSORA") || line.contains("COPIADORA")) {
				valueAux = hash.get("Equipamento de cópia");
				valueAux++;
				hash.replace("Equipamento de cópia", valueAux);
				contAux++;
				if (flag)
					cont++;
				flag = true;

			}

		}
		hash.put("Outros equipamentos", (cont - contAux));
		return hash;
	}
}
