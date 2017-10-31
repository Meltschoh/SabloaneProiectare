package Lab3;

public class Paragraf extends ElementsObj {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		this.text = text;
	}
	
	public Paragraf(final String text) {
		this.text = text;
	}

}