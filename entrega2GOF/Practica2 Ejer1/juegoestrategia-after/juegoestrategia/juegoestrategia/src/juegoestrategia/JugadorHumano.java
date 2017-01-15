package juegoestrategia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JugadorHumano extends Jugador {

	
	public JugadorHumano(FamiliaSoldadoFactory familia) {
		super(familia);
		
	}

	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	@Override
	public void jugar(FamiliaSoldadoFactory familia) {
		System.out.println("Qué hago? [d=disparar, b=poner bombas, a=crear_artillero, z=crear_zapador");
		String line;
		try {
			line = in.readLine();
			if (line.startsWith("d")){
				for (Artillero a : artilleros){
					a.disparar();
				}
			}
			if (line.startsWith("b")){
				for (Zapador z : zapadores){
					z.ponerBomba();
				}
			}
			
			//[PUNTO DE REFACTORIZACION]
			
			/////////////////////////////DUDA///////////////////////////////
			if (line.startsWith("a")){
				
			
					this.artilleros.add(familia.crearArtillero());
			}
			
			if (line.startsWith("z")){
		

					this.zapadores.add(familia.crearZapador());
				
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		/////////////////////////////DUDA///////////////////////////////
		

	}

}