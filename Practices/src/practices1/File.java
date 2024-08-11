package practices1;

abstract public class File {
	/*
	 * Create a class File that will have the following behaviors: open(), edit(), close()
	 * Edit() and close() are implemented methods while open() is abstract.
	 * 
	 * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide 
	 * specific implementation of open() behavior.
	 */
	abstract public void open();
	public void edit() {
		System.out.println("Edit");
	}
	public void close() {
		System.out.println("Close");
	}
	
}
 class JavaFile extends File{
	public void open() {
		System.out.println("Open JavaFile.");
		
	}
	
}
class WordFile extends File{
	public void open() {
		System.out.println("Open WordFile.");
		
	}
	
}
class PdfFile extends File{
	public void open() {
		System.out.println("Open PdfFile.");
		
	}
	
}

