package principal;

public class Quinquenio extends Complementos{

	private int anhos;
	private double salario;
	
	public Quinquenio(int anhos, Nomina n){
		super(n);
		this.anhos = anhos;
		this.salario+= 20*(anhos/5);
		this.salario+= n.calculaNomina();
	}
	
	public double calculaNomina(){
		return salario;
	}
	
}
