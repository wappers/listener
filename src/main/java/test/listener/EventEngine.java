package test.listener;

public class EventEngine {
	/**
	 * Does work with the event and finally calls the call back function.
	 * @param <ET> The Event
	 * @param event of type ET
	 * @param function EventFunction<ET> call back function.
	 */
	public static <ET extends Event> void emit(ET event, EventFunction<ET> function) {
		function.apply(event);
	}
}
