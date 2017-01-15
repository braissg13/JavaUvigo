import java.util.ArrayList;
import java.util.List;

public class TrabajoParalelo implements Programa{
	private List<Programa> programas = new ArrayList<Programa>();
	public void run(){
		
		List<Thread> hilos = new ArrayList<Thread>();
        
        for (Programa programa : programas){
          Thread hilo = new Thread(programa);
          hilos.add(hilo);
          hilo.start();
        }
      
        for (Thread hilo : hilos){
          try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
		
		
	} 

		 
		  public void addPrograma(Programa p){
			  programas.add(p);
		  }
		  public void removePrograma(Programa p){
			  programas.remove(p);
		  }
}
