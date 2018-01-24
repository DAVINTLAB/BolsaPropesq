package pesquisas;

import java.util.ArrayList;
import java.util.HashMap;

public class Escola {

	private HashMap<String, Temas> pesquisas = new HashMap<>();
	private String nomeEstrutura;

	public Escola(String nomeEstrutura) {

		this.nomeEstrutura = nomeEstrutura.toUpperCase();

	}

	public Escola(HashMap<String, Temas> pesquisas) {
		this.pesquisas = pesquisas;
	}

	public void addPesquisa(String pesquisador, Temas temas) {

		pesquisas.put(pesquisador, temas);

	}

	public ArrayList<String> getTemasAtuais() {

		ArrayList<String> temas = new ArrayList<>();
		HashMap<String, Temas> hashAux = getPesquisas();
		String[] vet;
		ArrayList<String> aux = pesquisadoresToArray();
		for (String s : aux) {
			vet = hashAux.get(s).listarTemasAtuais().split(";");

			for (int i = 0; i < vet.length; i++) {
				if (vet[i].length() > 2)
					temas.add(vet[i]);
			}
		}
		return temas;
	}

	public ArrayList<String> getTemasFuturos() {

		ArrayList<String> temas = new ArrayList<>();
		HashMap<String, Temas> hashAux = getPesquisas();
		String[] vet;
		ArrayList<String> aux = pesquisadoresToArray();
		for (String s : aux) {
			vet = hashAux.get(s).listarTemasFuturos().split(";");
			for (int i = 0; i < vet.length; i++) {
				if (vet[i].length() > 2)
					temas.add(vet[i]);
			}
		}
		return temas;
	}

	public ArrayList<String> pesquisadoresToArray() {

		String aux = pesquisas.keySet().toString();

		ArrayList<String> pesquisadores = new ArrayList<>();

		aux = aux.replace("[", "");
		aux = aux.replace("]", "");

		String vet[] = aux.split(",");

		for (int i = 0; i < vet.length; i++) {
			if (i > 0) { // GAMBIARRA
				pesquisadores.add(vet[i].substring(1));
			} else
				pesquisadores.add(vet[i]); // FIM DE GAMBIARRA
		}
		return pesquisadores;
	}

	public HashMap<String, Temas> getPesquisas() {
		return pesquisas;
	}

	public String getNomeEstrutura() {
		return nomeEstrutura;
	}

	public void setNomeEstrutura(String nomeEstrutura) {
		this.nomeEstrutura = nomeEstrutura;
	}

	public String toString() {
		HashMap<String, Temas> hashAux = getPesquisas();
		StringBuilder str = new StringBuilder();
		str.append("ESTRUTURA: " + nomeEstrutura + "\n \n");
		ArrayList<String> aux = pesquisadoresToArray();
		for (String s : aux) {
			str.append("PESQUISADOR: " + s + "\n");
			str.append("TEMAS ATUAIS DE PESQUISA: " + hashAux.get(s).listarTemasAtuais() + "\n");
			str.append("TEMAS FUTUROS DE PESQUISA: " + hashAux.get(s).listarTemasFuturos() + "\n \n");
			str.append("###################################################################################### \n \n");

		}

		return str.toString();
	}

	public String toStringAlternativo() {
		HashMap<String, Temas> hashAux = getPesquisas();
		StringBuilder str = new StringBuilder();
		ArrayList<String> aux = pesquisadoresToArray();
		String[] vet;
		for (String s : aux) {
			str.append("PESQUISADOR: " + s + "\n\n");
			str.append("TEMAS ATUAIS DE PESQUISA: \n");
			vet = hashAux.get(s).listarTemasAtuais().split(";");

			for (int i = 0; i < vet.length; i++) {
				str.append(vet[i] + ";\n");
			}
			str.append("\nTEMAS FUTUROS DE PESQUISA: \n");

			vet = hashAux.get(s).listarTemasFuturos().split(";");

			for (int i = 0; i < vet.length; i++) {
				
				str.append(vet[i] + ";\n");
			}

			if (aux.size() > 1)
				str.append(
						"\n########################################################################################################################## \n \n");

		}

		return str.toString();
	}

}
