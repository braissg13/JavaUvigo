package principal;

public abstract class Complementos implements Nomina{
	
	protected Nomina n;
	
		public Complementos (Nomina n){
			this.n = n;
		}
		
		public abstract double calculaNomina();
}
