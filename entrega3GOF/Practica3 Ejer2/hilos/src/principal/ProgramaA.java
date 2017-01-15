package principal;
import observer.Observable;


public class ProgramaA extends Observable implements Runnable,Programa{
	
	private boolean haTerminado = false;
  public void run(){
    try{ 
    	
    	this.notifyObservers();
      System.out.println("[INICIO] ProgramaA"); Thread.sleep(10); System.out.println("[FIN] ProgramaA");
      
      this.haTerminado = true;
      this.notifyObservers();
        
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
  
  
  @Override
	public boolean haTerminado() {
	  return this.haTerminado;
	}

}