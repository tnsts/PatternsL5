package lab5.observer;

/**
 * Observer Implementation 
 * Publishers: GUI components like Button, TextField, Window
 * Subscribers: GUIController
 * 
 * @author tnsts
 */

public class Main {
	public static void main(String[] args) {
		GUIController controller1 = new GUIController("Happy Contoller");
		GUIController controller2 = new GUIController("Sad Contoller");
		GUIController controller3 = new GUIController("Don't Care Contoller");
		
		Button button = new Button(1, "#1 BOSS");
		Window window = new Window(13, "Just another allert window");
		TextField textfield = new TextField(7, "Shut up and give me Your Data");
		
		button.subscribe(controller1);
		button.subscribe(controller2);
		button.subscribe(controller3);
		
		window.subscribe(controller2);
		textfield.subscribe(controller1);
		textfield.subscribe(controller3);
		
		button.notifySubscribers();
		System.out.println();
		
		window.notifySubscribers();
		System.out.println();
		
		textfield.notifySubscribers();
		System.out.println();
		
		button.unsubscribe(controller2);
		button.notifySubscribers();
	}
}
