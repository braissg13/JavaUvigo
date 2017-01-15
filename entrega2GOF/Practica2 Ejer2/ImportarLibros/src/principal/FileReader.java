package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader{

	private File input;
	
	public FileReader(File input){
		  
		this.input = input;
	}
	
	public String read(){
		
		Scanner scan = null;
		
		try{
			scan = new Scanner(input);
			StringBuilder scanned = new StringBuilder();
			while(scan.hasNext()){
				String x = scan.nextLine();
                scanned.append(x+"\t");
			}
			scan.close();
			return scanned.toString();
		} catch(FileNotFoundException e){
			throw new RuntimeException(e);
		}
		
	}
}
