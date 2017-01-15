package ds.miniframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public abstract class Aplicacion implements Observer{
	

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	private List<Operacion> operaciones;

	private List<String> parametros = new ArrayList<String>();
		
	
	public Aplicacion (){
		this.operaciones = crearOperaciones();
	}
	
	public void run() throws NumberFormatException, IOException{
		//operaciones = crearOperaciones();
		
		// visualizar menu
		System.out.println("Menu de operaciones: ");
		int i = 0;
		for (Operacion op : this.operaciones) {
			System.out.println(i+". "+op.getNombre());
			i++;
			
		}

		if(!operaciones.isEmpty()){
		//pedir opcion
		System.out.println("Seleccione opcion ");
		int opcionLeida = Integer.parseInt(in.readLine());
		
		Operacion aEjecutar = this.operaciones.get(opcionLeida);
		System.out.println(aEjecutar.getNombreParametros());
		
		
		//introducir parametros
		parametros = Arrays.asList(new String[aEjecutar.getNombreParametros().size()]);
		for(int x=0;x<parametros.size();x++){
		System.out.println("Introduzca el parametro nº "+(x+1));
		String parametroLeido = in.readLine();
		parametros.set(x, parametroLeido);
		}
		
		System.out.println("Solucion: "+ aEjecutar.operar(parametros));
		MyLogger loggerChain = (new ChainPatternBuilder()).getChainOfLoggers();
		  
		 loggerChain.logMessage(Logger.DEBUG, 
		         "Operacion ejecutada.");
		
	
		}
	}
	
	protected abstract List<Operacion> crearOperaciones(); //factory method

	@Override
	public void update(Observable observable, int estado) {
		// TODO Auto-generated method stub
		if(estado==0){
		System.out.println("Comienza operacion");
		}else if(estado==1){
			System.out.println("Operacion en transcurso");
		}else{
			System.out.println("Operacion finalizada con exito");
		}
	}

}
