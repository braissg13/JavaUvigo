package principal;

import observer.Observable;

public class ProgramaB extends Observable implements Runnable,Programa{
	
	private boolean haTerminado = false;
	
  public void run(){
    try{ 
      this.notifyObservers();
      System.out.println("[INICIO] ProgramaB"); Thread.sleep(30); System.out.println("[FIN] ProgramaB"); 
      this.haTerminado = true;
      this.notifyObservers();
      
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  }
  
  @Override
	public boolean haTerminado() {
	  return this.haTerminado;
	}

}