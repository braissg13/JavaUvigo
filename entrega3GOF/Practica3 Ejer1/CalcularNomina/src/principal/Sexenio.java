package principal;

public class Sexenio extends Complementos{

	private int anhos;
	private double salario;
	
	public Sexenio(int anhos, Nomina n){
		super(n);
		this.anhos = anhos;
		this.salario+= 50*(anhos/6);
		this.salario+= n.calculaNomina();
	}
	
	public double calculaNomina(){
		return salario;
	}
	
}
