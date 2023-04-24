package Chapter13;

class Bag<T,N> {
	private T thing;
	private N name;
	
	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}
	public T getThing () {
		return thing;
	}
	
	public void setThing (T thing) {
		this.thing = thing;
	}
	public N getName() {
		return name;
	}
	public void setName (N name) {
		this.name = name;
	}
	void showType() {
		System.out.println("T타입은" + thing.getClass().getName());
		System.out.println("N타입은" + name.getClass().getName());
	}
}

class Book {
	public String toString() {
		return "책";
	}
}
class PencilCase {}
class NotBook {}

public class BagTest02 {

	public static void main(String[] args) {
		
		Bag<Book, String> bag = new Bag<Book, String>(new Book(), "과학");
		
		bag.showType();
		
		Book book = bag.getThing();
		String name = bag.getName();
		
		System.out.println("Thing is : " + book);
		System.out.println("name is : " + name);

	}

}
