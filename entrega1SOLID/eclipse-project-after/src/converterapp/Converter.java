package converterapp;

public class Converter {
	
	private Reader ra;
	private Writter wr;
	private Transformer tr;
	
	
	public Converter(Reader ra, Writter wr, Transformer tr){
		
		this.ra = ra;
		
		this.wr = wr;
		
		this.tr = tr;
		
	}
	
	public void convert(){
		wr.writte(this.tr.transform(this.ra.read()));
	}
	
	public Reader getFileReader(){
		return ra;
	}
	public Writter getFileWritter(){
		return wr;
	}
	public Transformer getTab2XML(){
		return tr;
	}
}
