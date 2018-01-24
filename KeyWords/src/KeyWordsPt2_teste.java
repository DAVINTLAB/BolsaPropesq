import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.io.*;
import java.lang.reflect.Array;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class KeyWordsPt2_teste {

	public static void main(String[] args) {
		String line = "";
		ArrayList<String> palavras = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:/Users/eduardo/Desktop/Vinícius/PalavrasChave(Repeticao)_.txt"));

			while (br.ready()) {
				line = br.readLine();
				line = line.substring(1);
				palavras.add(line);

			}
			br.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();

		}

		for (String s : palavras) {
			System.out.println(s);

		}

	}

}
