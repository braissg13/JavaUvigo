package principal;

import java.io.File;

public class app {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer archivo directamente
		
		
		File input = new File("libros.txt");
		File output = new File("salida.xml");
		
		Reader fr = new FileReader(input);
		
		BuilderBiblioteca bb = new BuilderBiblioteca();
		BuilderXML bxml = new BuilderXML();

		
		Biblioteca b = bb.crearBiblioteca(bb.addLibros(fr.read()));
		
		
		System.out.println(b.toString());
				
		bxml.writte(bxml.transform(bxml.addLibros(fr.read())),output );
		
	}

}
