package pesquisas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Temas {

	private ArrayList<String> temasAtuais;
	private ArrayList<String> temasFuturos;

	public Temas(ArrayList<String> temasAtuais, ArrayList<String> temasFuturos) {
		this.temasAtuais = temasAtuais;
		this.temasFuturos = temasFuturos;
	}

	public ArrayList<String> getTemasAtuais() {
		String vet[] = listarTemasAtuais().split(";");
		ArrayList<String> retorno = new ArrayList<>();
		for (int i = 0; i < vet.length; i++) {
			retorno.add(vet[i]);
		}
		return retorno;
	}

	public void setTemasAtuais(ArrayList<String> temasAtuais) {
		this.temasAtuais = temasAtuais;
	}

	public ArrayList<String> getTemasFuturos() {
		String vet[] = listarTemasFuturos().split(";");
		ArrayList<String> retorno = new ArrayList<>();
		for (int i = 0; i < vet.length; i++) {
			retorno.add(vet[i]);
		}
		return retorno;
	}

	public void setTemasFuturos(ArrayList<String> temasFuturos) {
		this.temasFuturos = temasFuturos;
	}

	public String listarTemasAtuais() {
		String temaList = "";
		String temaAux = "";
		Character c = ' ';
		int cont;
		for (String s : temasAtuais) {
			cont = 0;
			c = s.charAt(cont);
			while (!c.toString().matches("[a-zA-Z]")) {
				c = s.charAt(cont);
				cont++;
			}
			if (cont > 1)
				cont--;

			temaAux = s.substring(cont);

			temaList = temaList + temaAux + ";";
		}
		return temaList;
	}

	public String listarTemasFuturos() {
		String temaList = "";
		String temaAux = "";
		Character c = ' ';
		int cont;
		for (String s : temasFuturos) {
			cont = 0;
			c = s.charAt(cont);
			while (!c.toString().matches("[a-zA-Z]")) {
				if (cont == s.length())
					break;
				c = s.charAt(cont); // ALGUNS ESTOURAM POIS SÃO SÓ ESPACOS EM
									// BRANCO, TENTAR UM FOR COM
									// S.LENGTH COMO DELIMITADOR, PARA EVITAR
									// QUE ESTOURE
				cont++;
			}
			if (cont > 1)
				cont--;

			temaAux = s.substring(cont);
			temaList = temaList + temaAux + ";";
		}
		if (temaList.length() <= 4) {
			return "NENHUM;";
		}
		return temaList;
	}

	@Override
	public String toString() {
		return "TEMAS ATUAIS DE PESQUISA: " + listarTemasAtuais() + "\n" + "TEMAS FUTUROS DE PESQUISA"
				+ listarTemasFuturos() + "\n";

	}

}
