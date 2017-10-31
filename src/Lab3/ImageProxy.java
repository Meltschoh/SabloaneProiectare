package Lab3;

public class ImageProxy extends AbstractElement{

	private String fileName;
	private Imagine realImagine=null;
	
	
	void ImageProxy (String fileName){
		this.fileName=fileName;
	
	}

	public Imagine print() {
		if(realImagine==null)
			realImagine=new Imagine(fileName);
		
	return realImagine=print();
	}
}

