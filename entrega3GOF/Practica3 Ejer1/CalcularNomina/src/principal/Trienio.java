package principal;

public class Trienio extends Complementos{

	private int anhos;
	private double salario;
	
	public Trienio(int anhos, Nomina n){
		super(n);
		this.anhos = anhos;
		this.salario+= 10*(anhos/3);
		this.salario+= n.calculaNomina();
	}
	
	public double calculaNomina(){
		return salario;
	}
	
}
