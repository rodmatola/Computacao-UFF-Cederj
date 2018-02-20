import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ebook extends Midia{
	int numeroDePaginas;
	
	public Ebook(String autor, String url, LocalDate dataPublicacao, String titulo, int numeroDePaginas) {
		super(autor, url, dataPublicacao, titulo);
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public String toString() {
		String autorTitulo = super.toString();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String data = dataPublicacao.format(formatador);
		
		return autorTitulo + "Publicado em " + data;
	}

}
