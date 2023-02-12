package Biblioteca;
import java.util.Date;
import java.util.Calendar;

public class Aluguel {
	private int codigo;
	private Cliente cliente;
	private Livro livro;
	private Date dataAluguel = new Date();
	private Date dataDevolucao = null;
	
	public Aluguel(int codigo, Cliente c, Livro l) {
		this.codigo = codigo;
		this.cliente = c;
		this.livro = l;
	}
	
	public Date gerarDataMaxima() {
		Calendar calendario = Calendar.getInstance();
		calendario.add(Calendar.DATE, 14);
		Date data = calendario.getTime();
		
		return data;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Date getDataAluguel() {
		return dataAluguel;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	
}