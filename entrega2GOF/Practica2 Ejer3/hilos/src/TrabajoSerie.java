import java.util.ArrayList;
import java.util.List;

public class TrabajoSerie implements Programa {
	private List<Programa> programas = new ArrayList<Programa>();
	public void run(){
		for (Programa programa : programas){
			programa.run();
		}
		
		 //en el parelelo
                 /* List<Thread> hilos = new ArrayList<>();
                
                  for (Programa programa : programas){
                    Thread hilo = new Thread(programa);
                    hilos.add(hilo);
                    hilo.start();
                  }
                
                  for (Thread hilo : hilos){
                    hilo.join();
                  }
                  */
                  
		  } 

		 
		  public void addPrograma(Programa p){
			  programas.add(p);
		  }
		  public void removePrograma(Programa p){
			  programas.remove(p);
		  }
}
