package converterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UI f = new UI();
		UI f2 = new UI();
		
		File input = f.getInputFile();
		File output = f2.getOutputFile();
		
		Reader fr = new FileReader(input);
		Transformer t = new Tab2XML();
		Writter fw = new FileWritter(output);
		//Writter sw = new ScreenWritter();
		
	    Converter c = new Converter(fr,fw,t);
	
	    c.convert();
		System.out.println("Terminado con exito.");      
	           
	        
	}

}
