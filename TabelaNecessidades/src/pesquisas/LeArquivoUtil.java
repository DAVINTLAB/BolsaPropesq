package pesquisas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class LeArquivoUtil {

	public void cleanTxt(String textBruto) {

		String linha = "";
		String linhaAux = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(textBruto));

			while (br.ready()) {
				linhaAux = br.readLine();
				if (linhaAux.length() > 1) {
					linhaAux = linhaAux.toUpperCase().replace('"', ' ');
					linha = linha + linhaAux;
				}
			}

			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		String[] words = linha.split("#");
		textBruto = textBruto.replace(".txt", "Clean.txt");

		String content = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(textBruto));

			for (int i = 0; i < words.length; i++) {
				content = words[i];
				bw.write(content + "\n");
			}
			bw.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public Escola makeStruct(String txtClean, String nomeEstrutura) {
		String line = "";
		String lineAux = "";
		String[] teste;
		ArrayList<String> profs = new ArrayList<>();
		ArrayList<String> temas = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(txtClean));

			while (br.ready()) {
				lineAux = br.readLine();
				teste = lineAux.split("%");
				profs.add(teste[0].substring(teste[0].indexOf('&') + 1));
				temas.add(teste[1]);
				line = line + lineAux;

			}
			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		ArrayList<String> temasAtuais = new ArrayList<>();
		ArrayList<String> temasFuturos = new ArrayList<>();
		String[] linhas;
		String linha = "";
		for (String s : temas) {

			linha = s.replace('.', ',');
			linha = linha.replace('|', ',');
			linha = linha.replace(';', ',');
			linha = linha.replace(':', ','); // DESTA FORMA ALGUMAS COISAS SEM
												// SENTIDO SURGEM, SE
												// ELIMINARMOS TUDO ANTERIOR
												// "SUBSTRING(INDEXOF(':')",
												// PODEMOS PERDER
												// MUITA COISA QUE VINHA
												// ANTERIOR AO ':'
			linha = linha.replace('$', '#');
			linha = linha.replace("(", "");
			linha = linha.replace(")", "");
			linhas = linha.split("#");

			if (linhas.length < 2) {
				temasAtuais.add(linhas[0]);
				temasFuturos.add("NENHUM");
			} else {
				temasAtuais.add(linhas[0]);
				temasFuturos.add(linhas[1]);

			}

		}

		
	
		// MUITAS SEPARAÇÕES ESPEREDAS ACONTECEM
		int cont;
		double pct;
		char[] charVet;
		String aux = "";
		for (int i = 0; i < temasAtuais.size(); i++) {
			cont = temasAtuais.get(i).lastIndexOf(" E ");
			pct = cont * 1.0 / temasAtuais.get(i).length();
			if (pct >= 0.75) {
				aux = "";
				charVet = temasAtuais.get(i).toCharArray();
				charVet[cont + 1] = ',';
				for (int j = 0; j < charVet.length; j++) {
					aux = aux + charVet[j];
				}
				temasAtuais.set(i, aux);

			}

		}
		
		for (int i = 0; i < temasFuturos.size(); i++) {
			cont = temasFuturos.get(i).lastIndexOf(" E ");
			pct = cont * 1.0 / temasFuturos.get(i).length();
			if (pct >= 0.75) {
				aux = "";
				charVet = temasFuturos.get(i).toCharArray();
				charVet[cont + 1] = ',';
				for (int j = 0; j < charVet.length; j++) {
					aux = aux + charVet[j];
				}
				temasFuturos.set(i, aux);

			}

		}

		

		
		ArrayList<String> temasAtuaisAux = new ArrayList<>();
		ArrayList<String> temasFuturosAux = new ArrayList<>();
		String[] auxAtuais;
		String[] auxFuturos;
		Temas temasAux;
		Escola est = new Escola(nomeEstrutura);
		for (int i = 0; i < profs.size(); i++) {
			auxAtuais = temasAtuais.get(i).split(",|&");
			temasAtuaisAux = new ArrayList<>();
			temasFuturosAux = new ArrayList<>();
			for (int j = 0; j < auxAtuais.length; j++) {
				if (auxAtuais[j].length() > 1)
					temasAtuaisAux.add(auxAtuais[j]);
			}
			auxFuturos = temasFuturos.get(i).split(",|&");
			for (int j = 0; j < auxFuturos.length; j++) {
				if (auxFuturos[j].length() > 1)
					temasFuturosAux.add(auxFuturos[j]);

			}
			temasAux = new Temas(temasAtuaisAux, temasFuturosAux);

			est.addPesquisa(profs.get(i), temasAux);
		}

		// TODO ORGANIZAR EM ESTRUTURA DE LEITURA E DE CHAMADA PARA OUTROS
		// ARQUIVOS, REMOVER A GAMBI DA CLASSE ESTRUTURA
		// E DIVIDIR MELHOR

		return est;
	}

}
