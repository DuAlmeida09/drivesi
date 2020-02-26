package HerancaExcecoes;
class ExceptionA extends Exception {
	public ExceptionA(String msg) {
		super("Tratando por ExceptionA --" + msg);
	}
}

class ExceptionB extends ExceptionA {
	public ExceptionB(String s) {
		super(s);
	}
}

class ExceptionC extends ExceptionB {
	public ExceptionC(String s) {
		super(s);
	}
}

public class Main {

	public static void main(String[] args) throws ExceptionB, ExceptionC {
		try {
			throw new ExceptionB("Lan�ou exce��o B");
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
		try {
			throw new ExceptionC("Lan�ou exce��o C");
		} catch (ExceptionA e) {
			e.printStackTrace();
			}
		}
	} 
