package converterapp;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader implements Reader{
	
	private File input;
	
	public FileReader(File input){
		  
		this.input = input;
	}

	public String read(){
		  Scanner scanner = null;

          try {
                  scanner = new Scanner(input);
                  StringBuilder resultado = new StringBuilder();
                  while(scanner.hasNext()){
                          String x = scanner.nextLine();
                          resultado.append(x+"\t");
                  }
                  scanner.close();
                  return resultado.toString();

          } catch (FileNotFoundException e) {
                  /* las excepciones mejor lanzarlas, no escribir nada
al usuario, puesto que queremos que siempre es interesante que sea
reutilizable en otro tipo de interfaces de usuario */
                  throw new RuntimeException(e);
          	
          }
	}      
	

}
