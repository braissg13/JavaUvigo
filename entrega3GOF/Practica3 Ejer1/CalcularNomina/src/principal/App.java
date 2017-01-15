package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			
		File input = new File("entrada.txt");
		
		Scanner scan = new Scanner(input);
		
		while (scan.hasNext()){
			String x = scan.nextLine();
			 String[] tokens = x.split("\t");
			 
			 if(tokens[1].equals("A")){
				 if(tokens[3].equals("SI")){
					 int anhos = Integer.parseInt(tokens[2]);
					 Nomina n = new CargoGestion(new Sexenio(anhos,new Quinquenio(anhos, new Trienio(anhos, new EscalaA()))));
					 System.out.println(tokens[0]+" "+n.calculaNomina());
				 } else{
					 int anhos = Integer.parseInt(tokens[2]);
					 Nomina n = new Sexenio(anhos,new Quinquenio(anhos, new Trienio(anhos, new EscalaA())));
					 System.out.println(tokens[0]+" "+n.calculaNomina());
				 }
			 } else{
				 if(tokens[1].equals("B")){
					 if(tokens[3].equals("SI")){
						 int anhos = Integer.parseInt(tokens[2]);
						 Nomina n = new CargoGestion(new Sexenio(anhos,new Quinquenio(anhos, new Trienio(anhos, new EscalaB()))));
						 System.out.println(tokens[0]+" "+n.calculaNomina());
					 } else{
						 int anhos = Integer.parseInt(tokens[2]);
						 Nomina n = new Sexenio(anhos,new Quinquenio(anhos, new Trienio(anhos, new EscalaB())));
						 System.out.println(tokens[0]+" "+n.calculaNomina());
					 }
				 } else{
					 if(tokens[1].equals("C")){
						 if(tokens[3].equals("SI")){
							 int anhos = Integer.parseInt(tokens[2]);
							 Nomina n = new CargoGestion(new Sexenio(anhos,new Quinquenio(anhos, new Trienio(anhos, new EscalaC()))));
							 System.out.println(tokens[0]+" "+n.calculaNomina());
						 } else{
							 int anhos = Integer.parseInt(tokens[2]);
							 Nomina n = new Sexenio(anhos,new Quinquenio(anhos, new Trienio(anhos, new EscalaC())));
							 System.out.println(tokens[0]+" "+n.calculaNomina());
						 }
					 }
				 }
			 }
		}
		scan.close();
		
			
	}

}
