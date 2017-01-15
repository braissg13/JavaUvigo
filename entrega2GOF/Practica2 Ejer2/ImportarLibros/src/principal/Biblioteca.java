package principal;

import java.util.List;

public class Biblioteca {

	private List<Libro> l;
	
	public Biblioteca(List<Libro> l){
		this.l = l;
	}
	
	public List<Libro> getLibros(){
		return l;
	}
	
	public String toString(){
		 String toret="";
		 
		 System.out.println("BIBLIOTECA\n");
		 
        
         for(Libro libro : l){
             toret+="Libro: "+libro.getNombreLibro()+"\t";
             toret+="Autor: "+libro.getAutor().getNombre()+"\t";
             toret+="ISBN: "+libro.getISBN()+"\n";
             toret+= "------------------------------------------------------------------------------------- \n";
         }   
         
         return toret;
	}
}
