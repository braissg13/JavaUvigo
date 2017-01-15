package principal;

import observer.Observable;

public class ProgramaC extends Observable implements Runnable,Programa{
	private boolean haTerminado = false;
	  public void run(){
	    try{ 
	    	
	    	this.notifyObservers();
	      System.out.println("[INICIO] ProgramaC"); Thread.sleep(15); System.out.println("[FIN] ProgramaC");
	      
	      this.haTerminado = true;
	      this.notifyObservers();
	        
	    }catch(InterruptedException e){ throw new RuntimeException(e);} 
	  } 
	  
	  
	  @Override
		public boolean haTerminado() {
		  return this.haTerminado;
		}
  
}