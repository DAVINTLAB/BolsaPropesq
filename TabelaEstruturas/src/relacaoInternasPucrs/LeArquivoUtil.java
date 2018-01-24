package relacaoInternasPucrs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LeArquivoUtil {

	public static String cleanTxt(String text) {
		String linha = "";
		String[] vet;
		StringBuilder str = new StringBuilder();
		int count;
		String aux = "";
		Character c = ' ';
		int cont = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(text));

			while (br.ready()) {
				linha = br.readLine();
				vet = linha.split("&");
				count = vet[1].length() - vet[1].replace(";", "").length();
				if (vet[1].length() > 3) {
					count++;
					c = vet[1].charAt(cont);
					while (!c.toString().matches("[a-zA-Z]")) {
						c = vet[1].charAt(cont);
						cont++;
					}
					if (cont > 1)
						cont--;
					vet[1] = vet[1].substring(cont);
				}
				if (vet[1].length() < 2)
					vet[1] = aux;
				str.append(vet[0] + " & " + vet[1] + " & " + count + "\n");

			}

			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return str.toString();
	}
}
