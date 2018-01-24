package relacaoOutrasInstituicoes;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class Main {

	public static void main(String args[]) {

		Estrutura struct = LeArquivoUtil
				.cleanTxt("C:\\Users\\eduardo\\Desktop\\Vinícius\\RelacaoOutrasIntituicoes.txt");

		System.out.println(struct.toStringCSV());
		
		

	}

}
