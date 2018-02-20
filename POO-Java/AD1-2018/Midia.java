import java.time.LocalDate;

public class Midia {
	String autor;
	String url;
	LocalDate dataPublicacao;
	String titulo;
	
	public Midia(String autor, String url, LocalDate dataPublicacao, String titulo) {
		this.autor = autor;
		this.url = url;
		this.dataPublicacao = dataPublicacao;
		this.titulo = titulo;		
	}
	
	public String toString() {
		String autor = this.autor;
		String titulo = this.titulo;
		String tipo = this.getClass().toString();
		
		return tipo.substring(6) + ", Autor: " + autor + ", Título: " + titulo + ", ";
	}

}
