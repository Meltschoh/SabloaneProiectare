package Lab3;

import javax.lang.model.element.Element;

public class Tabel extends AbstractElement {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
	
	public Tabel(final String name) {
		this.name = name;
	}
	public void print()
	{
		Object continut;
		for(Element elem:continut)
			elem.print(i);
	}
}