import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.io.*;
import java.lang.reflect.Array;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class KeyWordsPt2 {

	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:/Users/eduardo/Desktop/Vinícius/Palavras Agrupadas.txt"));

			while (br.ready()) {
				line = line + br.readLine();
				//line = line.replace('=', ' ');

			}
			br.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();

		}

		String[] words = line.split(",");
		ArrayList<String> palavras = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			//System.out.println(words[i]);
			palavras.add(words[i]);
		}

		Collections.sort(palavras.subList(0, palavras.size()));

		System.out.println("############################");
		System.out.println("############################");
		System.out.println("############################");
		for (String s : palavras) {

			System.out.println(s);

		}

	}
}
