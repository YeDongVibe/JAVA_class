package Chapter5;

public class Armor {
	
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	
	public void setName() {
		String value = "mark6";
		name = value;

	}
	
	public String getName() {
		if (name == null)
			return "No Name" ;
		
		return name;
	}

}
