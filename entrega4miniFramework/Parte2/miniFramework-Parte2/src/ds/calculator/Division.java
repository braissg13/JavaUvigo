package ds.calculator;

import java.util.Arrays;	
import java.util.List;

import ds.miniframework.Aplicacion;
import ds.miniframework.Operacion;

public class Division extends Operacion{
	

	public Division() {
		super("Division", 
			Arrays.asList(new String[] {"dividendo", "divisor"}));
		
		// TODO Auto-generated constructor stub
	}

	public String operar(List<String> listaParametros) {
		Aplicacion ap = new Calculadora();
		Division div = new Division();
		div.addObserver(ap);
		div.notifyObservers(0);
		long data = System.currentTimeMillis();
		Double resultado;
		resultado = (Double.parseDouble(listaParametros.get(0)) / Double.parseDouble(listaParametros.get(1)));
		long actual = System.currentTimeMillis()-data;
		if (actual>1){
			System.out.println("En ejecucion durante..."+actual+"ms");
			div.notifyObservers(1);
		}
		div.notifyObservers(2);
		return "" + resultado;

		
	}
	

}