package heranca2;

public class C3 extends C2 implements I1{

	// C3 n�o precisa ter construtor pois o construtor de C2 n�o tem par�metros
	// ent�o ser� chamado automaticamente pelo construtor padr�o de C2
	
	// Note que o m�todo imprimir existe em C2 e em I1
	// Por existir em I1 � necess�rio reimplement�-lo em C3 (n�o pode simplesmente herd�-lo)
	public void imprimir(){
		System.out.println("Imprimir C3");
	}
	
	void imprimirAlternativo(){
		super.imprimir();
		// super.super.imprimir();  N�O FUNCIONA n�o podemos usar "super.super"
	}
	
	void imprimirAlternativo2(){
		((C1)this).imprimir(); // vai executar o imprimir de C3 (e n�o de C1) � a mesma coisa de "imprimir();"
	}

	// as implementa��es de m�todos de interface precisam ser p�blicas
	public void metodoInterfaceI1() {
		System.out.println("Imprimindo valor da constante de I1: " + I1.constanteI1);
	}
	
}
