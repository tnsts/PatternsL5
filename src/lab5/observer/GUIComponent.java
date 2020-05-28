package lab5.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class GUIComponent implements Publisher {
	
	protected List<Subscriber> subscribers;
	
	protected int id;
	protected String name;
	
	public GUIComponent(int id, String name) {
		this.id = id;
		this.name = name;
		subscribers = new ArrayList<Subscriber>();
	}

	@Override
	public void subscribe(Subscriber s) {
		subscribers.add(s);
	}

	@Override
	public void unsubscribe(Subscriber s) {
		subscribers.remove(s);
	}

	@Override
	public void notifySubscribers() {
		for (Subscriber s : subscribers) {
			s.update(id, name);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
