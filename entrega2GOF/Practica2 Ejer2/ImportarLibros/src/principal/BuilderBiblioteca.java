package principal;


import java.util.ArrayList;
import java.util.List;


public class BuilderBiblioteca extends BuilderGeneral{
	
	public List<Libro> addLibros(String txt){
		List<Libro> lista = new ArrayList<Libro>(); 
        String[] tokens = txt.split("\t");
        
        for(int i = 0, x = 1, z = 2; i<tokens.length-2;i++,x++,z++){
           
       	 Autor a = new Autor(tokens[x]);
       	 Libro l = new Libro(tokens[i],a, tokens[z]);
       	  lista.add(l);
          
          i+=2;
          x+=2;
          z+=2;
        }
        
        return lista;
        
	}
	
	public Biblioteca crearBiblioteca(List<Libro> l){
		Biblioteca b = null;
		
			b = new Biblioteca(l);
			return b;
	}
	
	
}
