package practices1;

public class FileTest {

	public static void main(String[] args) {
		File[] array= {new JavaFile(), new WordFile(), new PdfFile()};
         
         
		for(File a:array) {
			a.open();
		}
	}

}
