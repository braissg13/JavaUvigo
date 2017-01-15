package principal;
import java.util.ArrayList;
import java.util.List;

public class TrabajoSerie implements Programa {
	
	private List<Programa> programas = new ArrayList<Programa>();
	private boolean haTerminado;
	
	public void run(){
		for (Programa programa : programas){
			programa.run();
		}
                  
		  } 

		 
		  public void addPrograma(Programa p){
			  programas.add(p);
		  }
		  public void removePrograma(Programa p){
			  programas.remove(p);
		  }
		  
		  public boolean haTerminado() {
			  return this.haTerminado;
			}
}
