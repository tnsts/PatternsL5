package lab5.observer;

public class GUIController implements Subscriber {
	
	private String name;
	
	public GUIController(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(int id, String name) {
		System.out.println(
				"\"" + this.name + "\" have been notified about NEW EVENT on component with id = " 
						+ id + " and name \"" + name +"\""
				);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
