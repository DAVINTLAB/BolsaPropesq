package relacaoOutrasInstituicoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LeArquivoUtil {

	public static Estrutura cleanTxt(String text) {
		HashMap<String, HashSet<String>> hash = new HashMap<>();
		String linha = "";
		String linhaAux = "";
		String[] vet;
		String[] instituicoes;
		Character c = ' ';
		String instituicaoAux = "";
		HashSet<String> unidades;
		ArrayList<String> retorno = new ArrayList<>();
		int cont;
		try {
			BufferedReader br = new BufferedReader(new FileReader(text));

			while (br.ready()) {
				linha = br.readLine();
				vet = linha.split("&");
				if (vet[1].length() > 2) {
					instituicoes = vet[1].split(";");
					for (int i = 0; i < instituicoes.length; i++) {
						instituicaoAux = instituicoes[i];
						cont = 0;
						c = instituicaoAux.charAt(cont);
						while (!c.toString().matches("[a-zA-Z]")) {
							c = instituicaoAux.charAt(cont);
							cont++;
						}
						if (cont > 1)
							cont--;
						instituicaoAux = instituicaoAux.substring(cont);
						
						if (hash.containsKey(instituicaoAux)) {
							unidades = hash.get(instituicaoAux);
							unidades.add(vet[0] + ";");
							hash.replace(instituicaoAux, unidades);

						} else {
							unidades = new HashSet<>();
							unidades.add(vet[0] + ";");
							hash.put(instituicaoAux, unidades);
							retorno.add(instituicaoAux);
						}
					}
				}
			}

			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		Estrutura est = new Estrutura(retorno, hash);
		return est;
	}
}
