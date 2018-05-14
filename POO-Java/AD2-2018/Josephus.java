import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Josephus {

	public static void main(String[] args) {
		
		ArrayList<String> nomesOriginal = new ArrayList<>(); 
		
		BufferedReader br;
		int quantidadeDeKs = 0;
		ArrayList<Integer> k = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader(args[0]));
			String linha = br.readLine();
			while (!linha.trim().equals("FIM")) {
				nomesOriginal.add(linha);
				linha =  br.readLine();
			}
			
			quantidadeDeKs = Integer.parseInt(br.readLine().trim());
			
			
			for (int i = 0; i < quantidadeDeKs; i++) {
				k.add(Integer.parseInt(br.readLine()));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < quantidadeDeKs; i++) {
			int position = k.get(i) - 1;
			ArrayList<String> nomes = new ArrayList<>(nomesOriginal);
			int tam = nomes.size(); 
			if (position >= tam - 1) {
				position = position % (tam - 1) - 1;
			}
			while ( tam > 1 ) {
				nomes.remove(position);
				position = position - 1 + k.get(i);
				if (position >= tam - 1) {
					position = position % (tam - 1);
				}
				tam = nomes.size();
			}
			String saida = k.get(i) + " " + nomes.get(0);
			System.out.println(saida);
			try {
				Files.write(Paths.get("saida-" + args[0]),saida.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	}
}
