package ds.calculator;

public class LicenseManager {
	private boolean depago = false;
	
	public void setLicense(boolean actualizar){
		this.depago = actualizar;
	}
	
	public boolean checkIsFullVersion(){
		return depago;
	}

}
