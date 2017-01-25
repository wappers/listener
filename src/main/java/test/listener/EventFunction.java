package test.listener;
@FunctionalInterface
public interface EventFunction<T> {
	   public void apply(T parameter);
}
