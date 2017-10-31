package Lab3;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.type.TypeMirror;


public class Sectiune implements Element{

	String titlu;
	ArrayList<Element>continut=new ArrayList<Element>();
	
	Sectiune(String t)
	{
		this.titlu=t;
	}
	
	public void addElement(Element elem)
	{
		continut.add(elem);
		
	}
	
	public Element getElement(int i)
	{
		return (Element) continut.get(i);
	}

	@Override
	public <A extends Annotation> A[] getAnnotationsByType(Class<A> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R, P> R accept(ElementVisitor<R, P> arg0, P arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeMirror asType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <A extends Annotation> A getAnnotation(Class<A> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends AnnotationMirror> getAnnotationMirrors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Element> getEnclosedElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element getEnclosingElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElementKind getKind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Modifier> getModifiers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Name getSimpleName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
