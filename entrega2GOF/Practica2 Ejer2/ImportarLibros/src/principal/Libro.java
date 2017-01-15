package principal;

public class Libro {

	private String isbn;
	private Autor autor;
	private String nombreLibro;
	
	public Libro(String nombreLibro, Autor autor,String isbn ){
		this.nombreLibro = nombreLibro;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public String getNombreLibro(){
		return nombreLibro;
	}
	
	public String getISBN(){
		return isbn;
	}
	
	public Autor getAutor(){
		return autor;
	}
}
