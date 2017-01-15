package converterapp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class FileWritter implements Writter{
	
	private File output;
	
	public FileWritter(File output){
		this.output = output;

	}
	
	public void writte(String s){
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
