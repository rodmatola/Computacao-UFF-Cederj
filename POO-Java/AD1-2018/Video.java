import java.time.LocalDate;
import java.time.Period;

public class Video extends Midia{
	int duracao;
	String descricao;
	int numeroDeCurtidas;
	
	public Video(String autor, String url, LocalDate dataPublicacao, String titulo, int duracao, String descricao, int numeroDeCurtidas) {
		super(autor, url, dataPublicacao, titulo);
		this.duracao = duracao;
		this.descricao = descricao;
		this.numeroDeCurtidas = numeroDeCurtidas;
	}
	
	public String tempoPublicado(){
		Period tempo = Period.between(this.dataPublicacao, LocalDate.now());
		
		int anos = tempo.getYears();
		int meses = tempo.getMonths();
		int dias = tempo.getDays();
		String tempoPublicado = "";
		
		if (anos != 0 && anos != 1) {
			tempoPublicado += Integer.toString(anos) + " anos ";
		}else if (anos == 1){
			tempoPublicado += Integer.toString(anos) + " ano ";
		}
		if (meses != 0 && meses != 1) {
			tempoPublicado += Integer.toString(meses) + " meses ";
		}else if (meses == 1){
			tempoPublicado += Integer.toString(meses) + " mês ";
		}
		if (dias != 0 && dias != 1) {
			tempoPublicado += Integer.toString(dias) + " dias ";
		}else if (dias == 1){
			tempoPublicado += Integer.toString(dias) + " dia ";
		}
		
		return tempoPublicado;		
	}
	
	public String toString() {
		String autorTitulo = super.toString();
		String tempo = this.tempoPublicado();
		return autorTitulo + "Publicado há " + tempo;
	}
	
}
