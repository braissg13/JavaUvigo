package juegoestrategia;

import java.util.LinkedList;
import java.util.List;

public abstract class Jugador {

	protected List<Artillero> artilleros = new LinkedList<Artillero>();
	protected List<Zapador> zapadores = new LinkedList<Zapador>();
	public Jugador(FamiliaSoldadoFactory familia){
		artilleros.add(familia.crearArtillero());
		artilleros.add(familia.crearArtillero());
		zapadores.add(familia.crearZapador());
		zapadores.add(familia.crearZapador());
		
		//creamos el ejercito inicial (todos de la misma raza, no se pueden mezclar!)
			
		}

	public abstract void jugar(FamiliaSoldadoFactory familia);
}
