interface Container<T>
{
	void set(T a);
	T get();
}
class ContainerImpl<T> implements Container<T>
{
	private T variable;

	@Override
	public void set(T a) {
		variable = a;		
	}

	@Override
	public T get() {		
		return variable;
	}
	
}
public class GenericInterfaceExample {
	
	public static void main(String[] args) {
		
		Container<Integer> t = new ContainerImpl<>();
		t.set(100);
		System.out.println(t.get());
	}

}
