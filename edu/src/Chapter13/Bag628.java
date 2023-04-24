package Chapter13;

class Bag<T extends Solid> {
	private T thing;
	private String owner;
	
	public Bag(T thing) {
		this.thing = thing;
	}
	
	public T getThing() {
		return thing;
	}
	public void setThing (T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T타입은"+ thing.getClass().getName());
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}

class Solid{}
class Liquid{}

class Book extends Solid{} //서브클래스
class PencilCase extends Solid{}
class Notebook extends Solid{}

class Water extends Liquid{}
class Coffee extends Solid{
	T thing;
	String owner;
	public Bag(T thing) {
		thing = thing;
	}
	
	public T getThing() {return thing};
	String getOwner() { return owner};
	boolean isSameOwner(Bag<?> obj) {
		if (this.owner.equals(obj.getOwner()))
			return ture;
		return flase;
	}
}


public class Bag628 {

	public static void main(String[] args) {
		Bag<Book> bag = new Bag<> (new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		Bag<Water> bag4 = new Bag<>(new Water());
		Bag<Coffee> bag5 = new Bag<>(new Coffee());
	}

}
