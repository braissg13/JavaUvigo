package principal;
import observer.Observable;
import observer.Observer;

public class Main implements Observer{
	private Programa p;
	private int numProgramas;
	
	 public static void main(String[] args) throws InterruptedException {
		 new Main().ejecutar();
	 }
	 
	 private void ejecutar() {
		 //Creamos Programas
		 ProgramaA a= new ProgramaA();
		 a.addObserver(this);
		 ProgramaB b= new ProgramaB();
		 b.addObserver(this);
		 ProgramaC c= new ProgramaC();
		 c.addObserver(this);
		 ProgramaD d= new ProgramaD();
		 d.addObserver(this);
		 ProgramaE e= new ProgramaE();
		 e.addObserver(this);
		 ProgramaF f= new ProgramaF();
		 f.addObserver(this);
		 
		 //Creamos Trabajos en Serie
		 TrabajoSerie ts1 = new TrabajoSerie();
		 TrabajoSerie ts2 = new TrabajoSerie();
		 TrabajoSerie ts3 = new TrabajoSerie();
		 
		 //A�adimos programas a trabajos en Serie
		 ts1.addPrograma(a);
		 ts2.addPrograma(e);
		 ts3.addPrograma(d);
		 ts3.addPrograma(f);
		 //Creamos Trabajos en Paralelo
		 TrabajoParalelo tp1= new TrabajoParalelo();
		 
		 //A�adimos programas a trabajos en Paralelo
		 tp1.addPrograma(b);
		 tp1.addPrograma(c);
		 tp1.addPrograma(ts3);
		 
		 
		 //Invocamos metodo run
		 ts1.run();
		 tp1.run();
		 ts2.run();
		 
		// TODO Auto-generated method stub
		
	}

	public void update(Observable observable){
		 if (((Programa) observable).haTerminado()) {
			 updateMenos();
		 } else {
			 updateMas();
		 }
	 }
	 
	 public void updateMas(){
		 this.numProgramas++;
		 System.out.println("Creado un programa. Actualmente hay "+numProgramas+" en curso");
	 }
	 
	 public void updateMenos(){
		 this.numProgramas--;
		 System.out.println("Finalizado un programa. Actualmente hay "+numProgramas+" en curso");
	 }
	 
}
