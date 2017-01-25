package test.listener;

public class EventEngine {

	public static <T extends Event> void emit(T event, EventFunction<T> function) {
		function.apply(event);
	}
}
