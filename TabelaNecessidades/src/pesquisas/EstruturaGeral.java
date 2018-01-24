package pesquisas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class EstruturaGeral {

	private ArrayList<Escola> escolas = new ArrayList<>();

	public ArrayList<Escola> getEscolas() {
		return escolas;
	}

	public void generate(String text) {
		escolas.clear();
		String linha = "";
		String nomeEstrutura = "";
		String[] vet;
		Escola escola;
		String pesquisador;
		int count = -1;
		ArrayList<String> atuaisAux;
		ArrayList<String> futurosAux;
		Temas temas;
		try {
			BufferedReader br = new BufferedReader(new FileReader(text));

			while (br.ready()) {
				linha = br.readLine();

				if (linha.contains("###################################"))
					continue;
				if (linha.contains("ESTRUTURA:")) {
					nomeEstrutura = linha.substring(11);
					escola = new Escola(nomeEstrutura);
					escolas.add(escola);
					count++;

				}

				if (linha.contains("PESQUISADOR:")) {
					pesquisador = linha.substring(13);
					vet = br.readLine().substring(26).split(";");
					atuaisAux = new ArrayList<>();
					for (int i = 0; i < vet.length; i++) {
						if (vet[i].length() <= 3)
							continue;
						if (vet[i].substring(vet[i].length() - 1).equals(" ")) {
							atuaisAux.add(vet[i].substring(0, (vet[i].length() - 1)));
							continue;
						}
						atuaisAux.add(vet[i]);
					}
					vet = br.readLine().substring(27).split(";");
					futurosAux = new ArrayList<>();
					for (int i = 0; i < vet.length; i++) {
						if (vet[i].length() <= 2)
							continue;
						if (vet[i].equals("NENHUM"))
							continue;
						if (vet[i].substring(vet[i].length() - 1).equals(" ")) {
							atuaisAux.add(vet[i].substring(0, (vet[i].length() - 1)));
							continue;
						}

						futurosAux.add(vet[i]);

					}

					temas = new Temas(atuaisAux, futurosAux);
					escolas.get(count).addPesquisa(pesquisador, temas);

				}

			}

			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public String temasAtuaisProfessores(String tema, String escola) {
		HashMap<String, Temas> hash;
		ArrayList<String> pesquisadoresAux = new ArrayList<>();

		if (escola.contains("TODAS")) {
			hash = new HashMap<>();
			for (Escola e : escolas) {
				pesquisadoresAux.addAll(e.pesquisadoresToArray());
				hash.putAll(e.getPesquisas());

			}
		} else {

			int count = 0;
			for (int i = 0; i < escolas.size(); i++) {
				if (escolas.get(i).getNomeEstrutura().equals(escola)) {
					count = i;
					break;
				}
			}

			hash = escolas.get(count).getPesquisas();
			pesquisadoresAux = escolas.get(count).pesquisadoresToArray();
		}

		for (String pesq : pesquisadoresAux) {
			if (hash.get(pesq).getTemasAtuais().contains(tema))
				continue;
			hash.remove(pesq);
		}

		Escola esc = new Escola(hash);
		String retorno = esc.toStringAlternativo();

		return retorno;
	}

	public String temasFuturosProfessores(String tema, String escola) {
		HashMap<String, Temas> hash;
		ArrayList<String> pesquisadoresAux = new ArrayList<>();

		if (escola.contains("TODAS")) {
			hash = new HashMap<>();
			for (Escola e : escolas) {
				pesquisadoresAux.addAll(e.pesquisadoresToArray());
				hash.putAll(e.getPesquisas());

			}
			System.out.println();
		} else {

			int count = 0;
			for (int i = 0; i < escolas.size(); i++) {
				if (escolas.get(i).getNomeEstrutura().equals(escola)) {
					count = i;
					break;
				}
			}

			hash = escolas.get(count).getPesquisas();
			pesquisadoresAux = escolas.get(count).pesquisadoresToArray();
		}

		for (String pesq : pesquisadoresAux) {
			if (hash.get(pesq).getTemasFuturos().contains(tema))
				continue;
			hash.remove(pesq);
		}
		Escola esc = new Escola(hash);
		String retorno = esc.toStringAlternativo();

		return retorno;
	}

	public ArrayList<String> listarTemasAtuais(String estrutura) {
		ArrayList<String> retorno = new ArrayList<>();
		HashSet<String> aux = new HashSet<>();
		ArrayList<String> pesquisadores = new ArrayList<>();
		HashMap<String, Temas> hash;
		if (estrutura.contains("TODAS")) {
			hash = new HashMap<>();
			for (Escola e : escolas) {
				ArrayList<String> auxz = e.pesquisadoresToArray();
				pesquisadores.addAll(e.pesquisadoresToArray());
				hash.putAll(e.getPesquisas());
			}

		} else {

			int count = 0;
			for (int i = 0; i < escolas.size(); i++) {
				if (escolas.get(i).getNomeEstrutura().equals(estrutura)) {
					count = i;
					break;
				}
			}
			pesquisadores = escolas.get(count).pesquisadoresToArray();
			hash = escolas.get(count).getPesquisas();
		}

		for (String pesq : pesquisadores) {
			for (String s : hash.get(pesq).getTemasAtuais()) {
				retorno.add(s);
			}
		}

		for (String s : retorno) {
			aux.add(s);
		}

		retorno = new ArrayList<>();

		for (String s : aux) {
			if (s.equals("NENHUM"))
				continue;
			retorno.add(s);
		}

		Collections.sort(retorno, String.CASE_INSENSITIVE_ORDER);

		return retorno;
	}

	public ArrayList<String> listarTemasFuturos(String estrutura) {
		ArrayList<String> retorno = new ArrayList<>();
		HashSet<String> aux = new HashSet<>();
		ArrayList<String> pesquisadores = new ArrayList<>();
		HashMap<String, Temas> hash;
		if (estrutura.contains("TODAS")) {
			hash = new HashMap<>();
			for (Escola e : escolas) {
				pesquisadores.addAll(e.pesquisadoresToArray());
				hash.putAll(e.getPesquisas());
			}

		} else {

			int count = 0;
			for (int i = 0; i < escolas.size(); i++) {
				if (escolas.get(i).getNomeEstrutura().equals(estrutura)) {
					count = i;
					break;
				}
			}
			pesquisadores = escolas.get(count).pesquisadoresToArray();
			hash = escolas.get(count).getPesquisas();
		}

		for (String pesq : pesquisadores) {
			for (String s : hash.get(pesq).getTemasFuturos()) {
				retorno.add(s);
			}
		}

		for (String s : retorno) {
			aux.add(s);
		}

		retorno = new ArrayList<>();

		for (String s : aux) {
			if (s.equals("NENHUM"))
				continue;
			retorno.add(s);
		}

		Collections.sort(retorno, String.CASE_INSENSITIVE_ORDER);

		return retorno;
	}

	public ArrayList<String> nomeEstruturas() {
		ArrayList<String> retorno = new ArrayList<>();

		for (Escola e : escolas) {
			retorno.add(e.getNomeEstrutura());
		}

		retorno.add("TODAS AS ESCOLAS");

		return retorno;
	}

}
