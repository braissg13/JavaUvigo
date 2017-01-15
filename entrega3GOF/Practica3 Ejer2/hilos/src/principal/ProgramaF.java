package principal;

import observer.Observable;

public class ProgramaF extends Observable implements Runnable,Programa{
	private boolean haTerminado = false;
	  public void run(){
	    try{ 
	    	
	    	this.notifyObservers();
	      System.out.println("[INICIO] ProgramaF"); Thread.sleep(5); System.out.println("[FIN] ProgramaF");
	      
	      this.haTerminado = true;
	      this.notifyObservers();
	        
	    }catch(InterruptedException e){ throw new RuntimeException(e);} 
	  } 
	  
	  
	  @Override
		public boolean haTerminado() {
		  return this.haTerminado;
		}
  
}