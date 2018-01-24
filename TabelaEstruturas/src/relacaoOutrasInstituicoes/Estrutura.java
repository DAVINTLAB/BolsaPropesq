package relacaoOutrasInstituicoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Estrutura {

	private ArrayList<String> instituicoes;
	private HashMap<String, HashSet<String>> hash;

	public Estrutura(ArrayList<String> instituicoes, HashMap<String, HashSet<String>> hash) {
		this.instituicoes = instituicoes;
		this.hash = hash;
	}

	public ArrayList<String> getInstituicoes() {
		return instituicoes;
	}

	public void setInstituicoes(ArrayList<String> instituicoes) {
		this.instituicoes = instituicoes;
	}

	public HashMap<String, HashSet<String>> getHash() {
		return hash;
	}

	public void setHash(HashMap<String, HashSet<String>> hash) {
		this.hash = hash;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		String aux;
		for (String s : instituicoes) {
			aux = hash.get(s).toString();
			aux = aux.replace("[", "");
			aux = aux.replace("]", "");
			str.append("INSTITUIÇÃO EXTERNA: " + s + "\nUNIDADES RELACIONADAS: " + aux.replaceAll(";,", ";")
					+ "\n\n#############################################################\n\n");
		}

		return str.toString();

	}

	public String toStringCSV() {
		StringBuilder str = new StringBuilder();
		String aux;
		String cont= "";
		for (String s : instituicoes) {
			cont = cont + hash.get(s).size() + "\n";
			aux = hash.get(s).toString();
			aux = aux.replace("[", "");
			aux = aux.replace("]", "");
			str.append(s + " & " + aux.replaceAll(";,", ";")+ " & " + "\n");
		}
		str.append(cont);

		return str.toString();

	}
}
