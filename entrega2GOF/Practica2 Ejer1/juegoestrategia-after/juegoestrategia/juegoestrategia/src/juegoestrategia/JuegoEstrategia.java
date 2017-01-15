package juegoestrategia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuegoEstrategia {

	public static void main(String[] args)  {
		//while(true){
		Jugador maquina = new JugadorMaquina(new HarkonenFactory());
		
		System.out.println("JUEGA MAQUINA");
		maquina.jugar(new HarkonenFactory());

		//podriamos pedir el equipo al jugador
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Que equipo quieres ser: Atreides = 'a' | Harkonen = 'h'");
		try{
		String txt = in.readLine();
	
		
		if(txt.startsWith("a")){
		Jugador humano = new JugadorHumano(new AtreidesFactory());
		System.out.println("JUEGA HUMANO");
			humano.jugar(new AtreidesFactory());
		}
		if(txt.startsWith("h")){
			Jugador humano = new JugadorHumano(new HarkonenFactory());
			System.out.println("JUEGA HUMANO");
			humano.jugar(new AtreidesFactory());
		}
		}catch (IOException e) {
			throw new RuntimeException(e);
		}

	
}}
//}