package principal;

import observer.Observable;

public class ProgramaE extends Observable implements Runnable,Programa{
	private boolean haTerminado = false;
	  public void run(){
	    try{ 
	    	
	    	this.notifyObservers();
	      System.out.println("[INICIO] ProgramaE"); Thread.sleep(10); System.out.println("[FIN] ProgramaE");
	      
	      this.haTerminado = true;
	      this.notifyObservers();
	        
	    }catch(InterruptedException e){ throw new RuntimeException(e);} 
	  } 
	  
	  
	  @Override
		public boolean haTerminado() {
		  return this.haTerminado;
		}
 
}