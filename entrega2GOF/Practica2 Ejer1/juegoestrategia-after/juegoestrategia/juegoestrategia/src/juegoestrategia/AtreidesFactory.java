package juegoestrategia;

public class AtreidesFactory implements FamiliaSoldadoFactory{
	public Artillero crearArtillero(){
		Artillero a = new ArtilleroAtreides();
		System.out.println("Artillero Atreides creado");
		return a;
		}
	public Zapador crearZapador(){
		Zapador z = new ZapadorAtreides();
		System.out.println("Zapador Atreides creado");
		return z;
	}
}
