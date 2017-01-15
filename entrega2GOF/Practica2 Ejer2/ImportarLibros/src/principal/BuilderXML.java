package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class BuilderXML extends BuilderGeneral{

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
	
	
	public String transform(List <Libro> l){
		
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("<libros>\n");
        for(Libro libro : l){
           resultado.append("<libro>\n\t<titulo>" + libro.getNombreLibro() + "</titulo>\n\t<autor>"+ libro.getAutor().getNombre() + "</autor>\n\t<isbn>" + libro.getISBN() +"</isbn>\n</libro>\n");
        }
        resultado.append("</libros>");
      return resultado.toString();
	}
	
	public void writte(String s, File output){
		PrintStream out = null;
		
			try {
				out = new PrintStream(new FileOutputStream(output));
			} catch (FileNotFoundException e1) {
				throw new RuntimeException(e1);
			}
		
		out.println(s);
		out.close();
	}
}
