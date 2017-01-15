package ds.miniframework;

import java.util.LinkedList;
import java.util.List;

public class Observable {

	private List<Observer> observers = new LinkedList<>();

	
	public void addObserver(Observer o) {
		this.observers.add(o);
	}
	
	protected void notifyObservers(int estado) {
		for (Observer o: this.observers) {
			o.update(this,estado);
		}
	}
	
}
