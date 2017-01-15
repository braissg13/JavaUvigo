package ds.calculator;

import java.util.Arrays;
import java.util.List;

import ds.miniframework.Aplicacion;
import ds.miniframework.Operacion;

public class Suma extends Operacion{

	public Suma() {
		super("Suma", 
			Arrays.asList(new String[] {"sumando A", "sumando B"}));
		
		// TODO Auto-generated constructor stub
	}

	public String operar(List<String> listaParametros) throws NullPointerException {
		Aplicacion ap = new Calculadora();
		Suma sum = new Suma();
		sum.addObserver(ap);
		sum.notifyObservers(0);
		long data = System.currentTimeMillis();
		Double resultado;
		resultado = (Double.parseDouble(listaParametros.get(0)) + Double.parseDouble(listaParametros.get(1)));
		long actual = System.currentTimeMillis()-data;
		if (actual>1){
			System.out.println("En ejecucion durante..."+actual+"ms");
			sum.notifyObservers(1);
		}
		sum.notifyObservers(2);
		return "" + resultado;

	}
	

}
