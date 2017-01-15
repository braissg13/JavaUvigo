public class ProgramaE implements Runnable,Programa{
  public void run(){
    try{ 
      System.out.println("[INICIO] ProgramaE"); Thread.sleep(10); System.out.println("[FIN] ProgramaE"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
 
}