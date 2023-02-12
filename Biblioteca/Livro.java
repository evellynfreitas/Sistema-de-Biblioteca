package Biblioteca;

public class Livro {
	
	private int codigoLivro;
	private String titulo;
	private String autor;
	
	public Livro(int codigo, String titulo, String autor) {
		this.codigoLivro = codigo;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public int getCodigo() {
		return codigoLivro;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}

}
