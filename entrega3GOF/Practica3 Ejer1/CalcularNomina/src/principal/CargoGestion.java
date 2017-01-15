package principal;

public class CargoGestion extends Complementos{

	private double salario = 15;
	
	public CargoGestion(Nomina n){
		super(n);
		this.salario+= n.calculaNomina();
	}
	
	public double calculaNomina(){
		return salario;
	}
	
}
