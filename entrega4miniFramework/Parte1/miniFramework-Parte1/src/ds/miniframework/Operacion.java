package ds.miniframework;

import java.util.List;

public abstract class Operacion extends Observable {
private String nombreOperacion;
private List<String> listaParametros; 

public Operacion (String nombreOperacion, List<String> listaParametros){
	this.nombreOperacion = nombreOperacion;
	this.listaParametros = listaParametros;
	
}

public String getNombre() {
	return nombreOperacion;
}

public List<String> getNombreParametros() {
	return listaParametros;
}

public abstract String operar(List<String> listaParametros);

	
}

