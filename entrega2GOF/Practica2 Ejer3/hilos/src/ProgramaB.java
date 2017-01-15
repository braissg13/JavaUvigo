public class ProgramaB implements Runnable,Programa{
  public void run(){
    try{ 
      System.out.println("[INICIO] ProgramaB"); Thread.sleep(30); System.out.println("[FIN] ProgramaB"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 

}