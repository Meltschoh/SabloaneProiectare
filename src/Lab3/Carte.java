package Lab3;

import java.util.ArrayList;

import javax.lang.model.element.Element;

public class Carte {
	
	String titlu;
	ArrayList<Autor>autor;
	ArrayList<Element>continut=	new ArrayList<Element>();
	
	
	Carte(String titlu,ArrayList<Autor>a)
	{
		this.titlu=titlu;
		this.autor=a;
	}
	
	public void addElement(Element elem)
	{
		continut.add(elem);
	}
	
	public void print()
	{	
		for(Element elem:continut)
			((Carte) elem).print();
		
	}
	
	public static void main(String args[]) {
		
		Subcapitol subcap = new Subcapitol();
		
		subcap.elements.add(new Tabel(null));
		subcap.elements.add(new Imagine(null));
		
	}
		
		
	}


