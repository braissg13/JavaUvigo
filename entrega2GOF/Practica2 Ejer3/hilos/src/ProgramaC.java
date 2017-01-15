public class ProgramaC implements Runnable,Programa{
  public void run(){
    try{ 
      System.out.println("[INICIO] ProgramaC"); Thread.sleep(15); System.out.println("[FIN] ProgramaC"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
  
}