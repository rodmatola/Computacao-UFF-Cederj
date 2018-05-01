import java.util.ArrayList;

public class Josephus {

	public static void main(String[] args) {
		
		ArrayList<String> nomesOriginal = new ArrayList<>(); 
//		nomesOriginal.add("1");
//		nomesOriginal.add("2");
//		nomesOriginal.add("3");
//		nomesOriginal.add("4");
//		nomesOriginal.add("5");

//		nomesOriginal.add("José");
//		nomesOriginal.add("Henrique");
//		nomesOriginal.add("Francisco");
//		nomesOriginal.add("Manoel");
//		nomesOriginal.add("Rafael");
//		nomesOriginal.add("Marcus");
		
//		nomesOriginal.add("A");
//		nomesOriginal.add("J");
//		nomesOriginal.add("5");
//		nomesOriginal.add("P");
//		nomesOriginal.add("Q");
		
		nomesOriginal.add("Mario");
		nomesOriginal.add("Carlos");
		nomesOriginal.add("Antonio");
		nomesOriginal.add("Pedro");
		nomesOriginal.add("Joaquim");		
		nomesOriginal.add("Mauro");
		nomesOriginal.add("Roberto");
		nomesOriginal.add("Joao");
		nomesOriginal.add("Paulo");
		
		int quantidade_de_ks = 1;
		
		ArrayList<Integer> k = new ArrayList<>();
		k.add(3);
		k.add(4);
		k.add(7);
		
		
		for (int i = 0; i < quantidade_de_ks; i++) {
			int position = k.get(i) - 1;
			ArrayList<String> nomes = new ArrayList<>(nomesOriginal);
			int tam = nomes.size(); 
			System.out.println(nomes);
			if (position >= tam - 1) {
				position = position % (tam - 1) - 1;
			}
			while ( tam > 1 ) {
				//System.out.println(nomes.size());
				
				nomes.remove(position);
				System.out.println(nomes);
				position = position - 1 + k.get(i);
				if (position >= tam - 1) {
					position = position % (tam - 1);
				}
				tam = nomes.size();
			}
			System.out.println("---------------");
			System.out.println(k.get(i) + " " + nomes.get(0));
			System.out.println("---------------");
		}
	

	}
}
