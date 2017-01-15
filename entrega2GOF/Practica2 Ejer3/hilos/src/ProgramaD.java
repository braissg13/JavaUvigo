public class ProgramaD implements Runnable,Programa{
  public void run(){
    try{ 
      System.out.println("[INICIO] ProgramaD"); Thread.sleep(5); System.out.println("[FIN] ProgramaD"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
 
}