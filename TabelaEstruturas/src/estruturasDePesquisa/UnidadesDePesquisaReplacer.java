package estruturasDePesquisa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class UnidadesDePesquisaReplacer {

	public static void main(String args[]) {
		String linha = "";
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\eduardo\\Desktop\\Vinícius\\unidades.txt"));

			while (br.ready()) {

				linha = br.readLine();

				if (linha.contains("ESCOLA DE HUMANIDADES")) {
					System.out.println("ESCOLA DE HUMANIDADES");
				} else if (linha.contains("ESCOLA DE DIREITO")) {

					System.out.println("ESCOLA DE DIREITO");

				} else if (linha.contains("ESCOLA DE MEDICINA")) {

					System.out.println("ESCOLA DE MEDICINA");

				} else if (linha.contains("ESCOLA DE NEGOCIOS")) {
					System.out.println("ESCOLA DE NEGOCIOS");
				}

				else if (linha.contains("FACULDADE DE INFORMATICA") || linha.contains("FACULDADE DE ENGENGHARIA")
						|| linha.contains("URBANISMO") || linha.contains("AERONAUTICA")) {
					System.out.println("ESCOLA POLITECNICA");
				}

				else if (linha.contains("MATEMATICA") || linha.contains("QUIMICA")
						|| linha.contains("FACULDADE DE FISICA") || linha.contains("BIOCIENCIAS")) {
					System.out.println("ESCOLA DE CIENCIAS");
				}

				else if (linha.contains("FACULDADE DE ODONTOLOGIA") || linha.contains("ENFERMAGEM")
						|| linha.contains("CIENCIA DO DESPORTO") || linha.contains("FARMACIA")) {
					System.out.println("ESCOLA DE CIENCIAS DA SAUDE");
				}

				else if (linha.contains("COMUNICACAO SOCIAL")) {
					System.out.println("ESCOLA DE COMUNICACAO, ARTES E DESIGN");
				}

				else
					System.out.println("OUTROS");
			}

			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
