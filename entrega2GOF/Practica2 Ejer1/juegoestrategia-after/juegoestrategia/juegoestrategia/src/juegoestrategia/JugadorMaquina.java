package juegoestrategia;

public class JugadorMaquina extends Jugador {
	
	public JugadorMaquina(FamiliaSoldadoFactory familia) {
		super(familia);
	}

	public void jugar(FamiliaSoldadoFactory familia) {
		//disparamos!
		for (Artillero artillero : artilleros){
			artillero.disparar();
		}
		
		//ponemos bombas!
		for (Zapador zapador: zapadores){
			zapador.ponerBomba();
		}

	}

}
