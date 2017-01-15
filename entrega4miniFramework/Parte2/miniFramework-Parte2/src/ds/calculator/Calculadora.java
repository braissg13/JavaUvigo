package ds.calculator;

import java.io.IOException;			
import java.util.Arrays;
import java.util.List;

import ds.miniframework.Aplicacion;
import ds.miniframework.Observer;
import ds.miniframework.Operacion;

public class Calculadora extends Aplicacion implements Observer{
		
	static Operacion op;
	private static LicenseManager m = new LicenseManager();

	
	public List<Operacion> crearOperaciones(){
		if (m.checkIsFullVersion()){
		return Arrays.asList(new Operacion[]{
				new Suma(), new Division(), new Raiz()
		});
		}else{
		System.out.println("La operacion Raiz no esta disponible en version gratuita");
		return Arrays.asList(new Operacion[]{
					new Suma(), new Division()
			});
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// VERSION ACTUAL: GRATUITA
		m.setLicense(true); /*PASAR A VERSION DE PAGO*/
		while(true){
		Calculadora c = new Calculadora();
		if(m.checkIsFullVersion()){
			System.out.println("---------------VERSION DE PAGO-----------------");
			c.run();
		}
		else{
			System.out.println("---------------VERSION GRATUITA-----------------");
			c.run();
		}

		
		System.out.println("\n-----------------------------------------------");
		}
	}

}