package especificadores1;

public class AlphaSub1 extends Alpha{
	public static void main(String[]args) {
		Alpha.alphaPublic();
		Alpha.alphaProtected();
		Alpha.alphaNada();
		// N�O RODA PORQUE � PRIVATE  Alpha.alphaPrivate();
	}
}