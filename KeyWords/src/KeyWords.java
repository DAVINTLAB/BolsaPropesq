import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.lang.reflect.Array;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class KeyWords {

	public static void main(String[] args) {
		String line = "";
		HashMap<String, Integer> keyWords = new HashMap<>();
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:/Users/eduardo/Desktop/Vinícius/Palavras-chave.txt"));
			int oldValue;
			int newValue;

			while (br.ready()) {
				line = br.readLine();
				line = line.toUpperCase();
				line = line.replace(',', ' ');
				if (line.length() <= 1) {
					continue;
				}

				if (keyWords.containsKey(line)) {
					oldValue = keyWords.get(line);
					newValue = oldValue + 1;

					keyWords.replace(line, oldValue, newValue);

				} else {

					keyWords.put(line, 1);
				}

			}
			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();

		}

		System.out.println(keyWords.toString());

	}
}
