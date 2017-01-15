package juegoestrategia;

public class HarkonenFactory implements FamiliaSoldadoFactory {
		

	public Artillero crearArtillero(){
		Artillero a = new ArtilleroHarkonen();
		System.out.println("Artillero Harkonen creado");
		return a;
		}
	public Zapador crearZapador(){
		Zapador z = new ZapadorHarkonen();
		System.out.println("Zapador Harkonen creado");
		return z;
	}
	
}
