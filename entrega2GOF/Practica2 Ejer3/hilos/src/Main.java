
public class Main {
	 public static void main(String[] args) throws InterruptedException {
		 
		 //Creamos Programas
		 ProgramaA a= new ProgramaA();
		 ProgramaB b= new ProgramaB();
		 ProgramaC c= new ProgramaC();
		 ProgramaD d= new ProgramaD();
		 ProgramaE e= new ProgramaE();
		 ProgramaF f= new ProgramaF();
		 
		 //Creamos Trabajos en Serie
		 TrabajoSerie ts1 = new TrabajoSerie();
		 TrabajoSerie ts2 = new TrabajoSerie();
		 TrabajoSerie ts3 = new TrabajoSerie();
		 
		 //Añadimos programas a trabajos en Serie
		 ts1.addPrograma(a);
		 ts2.addPrograma(e);
		 ts3.addPrograma(d);
		 ts3.addPrograma(f);
		 //Creamos Trabajos en Paralelo
		 TrabajoParalelo tp1= new TrabajoParalelo();
		 
		 //Añadimos programas a trabajos en Paralelo
		 tp1.addPrograma(b);
		 tp1.addPrograma(c);
		 tp1.addPrograma(ts3);
		 
		 //Invocamos metodo run
		 ts1.run();
		 tp1.run();
		 ts2.run();
		 
		 
		 
	 }
	 
}
