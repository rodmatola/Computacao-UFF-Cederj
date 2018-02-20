import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Video video = new Video("Carlos Bazilio", "https://www.youtube.com/watch?v=bdpSqjTZJcg",  LocalDate.of(2017, 8, 22), "Por quê ainda estudar Java?", 998, "Razões para ainda se estudar a linguagem Java", 11);
		
		Ebook livro1 = new Ebook("Carlos Bazilio", "https://carlosbazilio.gitbooks.io/programando-nacozinha/content/pt-br/", LocalDate.of(2017, 9, 23), "Programando na Cozinha", 57);
		
		Ebook livro2 = new Ebook("Marijn Haverbeke", "http://eloquentjavascript.net/3rd_edition/", LocalDate.of(2010, 3, 6), "Eloquent JavaScript", 472);

		Midia[] midias = new Midia[] {video, livro1, livro2};
		
		for(Midia midia : midias) {
			System.out.println(midia.toString());
		}
		
	}
}

