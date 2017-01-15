public class ProgramaF implements Runnable,Programa{
  public void run(){
    try{ 
      System.out.println("[INICIO] ProgramaF"); Thread.sleep(5); System.out.println("[FIN] ProgramaF"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
  
}