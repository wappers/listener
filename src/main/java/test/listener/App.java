package test.listener;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		App a = new App();
	}

	public App() {
		EventEngine.emit(new Event1(), this::apply1);
		EventEngine.emit(new Event2(), this::apply2);
	}

	public void apply1(Event1 event) {
		System.out.println("Event1 recieved" + event);
	}

	public void apply2(Event2 event) {
		System.out.println("Event2 recieved" + event);
	}
}
