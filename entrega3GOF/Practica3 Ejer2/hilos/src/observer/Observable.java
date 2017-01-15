package observer;

import java.util.LinkedList;
import java.util.List;

public class Observable {

	private List<Observer> observers = new LinkedList<>();
	
	
	public void addObserver(Observer o){
		this.observers.add(o);
	}
	
	public void removeObserver(Observer o){
		this.observers.remove(o);
	}
	
	protected void notifyObservers(){
		for(Observer o : this.observers){
			o.update(this);
		}
	}
	
}
