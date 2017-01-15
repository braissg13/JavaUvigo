package ds.calculator;

import java.util.Arrays;
import java.util.List;

import ds.miniframework.Aplicacion;
import ds.miniframework.Operacion;

public class Raiz extends Operacion{
	LicenseManager m = new LicenseManager();
	public Raiz() {
		super("Raiz", 
			Arrays.asList(new String[] {"operando A"}));
		
		// TODO Auto-generated constructor stub
	}

	public String operar(List<String> listaParametros) throws NullPointerException {
		Aplicacion ap = new Calculadora();
		Raiz r = new Raiz();
		r.addObserver(ap);
		r.notifyObservers(0);
		long data = System.currentTimeMillis();
		Double resultado;
		resultado = Math.sqrt((Double.parseDouble(listaParametros.get(0))));
		long actual = System.currentTimeMillis()-data;
		if (actual>1){
			System.out.println("En ejecucion durante... "+actual+"ms");
			r.notifyObservers(1);
		}
		r.notifyObservers(2);
		return "" + resultado;
		}
		
	}
	

