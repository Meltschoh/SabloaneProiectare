package Lab3;

public interface Element  {
	
	public void add(Element elem);
	public void remove(Element elem);
	
	public Element get(int index);

	public static void print(){
		System.out.println(Element);
	}
	
	 
}
