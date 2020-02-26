package heranca;

/* a classe AlunoEspecial nao pode estender Aluno e Digitador pois, em Java,
 * cada classe s� pode extender uma classe.  */
public final class AlunoEspecial extends Aluno{
	/* J� que aluno n�o tem construtor sem par�metros � necess�rio criar um construtor aqui */
	AlunoEspecial(String nome, int RG, int NUSP){
		super(nome,RG,NUSP);
	}
	
	void respirar(){
		super.respirar(); // NAO � poss�vel usar, super.super.respirar (super.super n�o � permitido) 
		System.out.println("Aluno especial respirando.");
	}

	/*  Este metodo n�o pode ser implementado aqui por ser final na super-clase (Aluno)
	void fazerTrabalhos(){
		...
	}
	*/
	
	
	// PRECISA implementar todos os m�todos abstratos da super-classe
	void estudar(){
		System.out.println("Aluno Especial Estudando");
	}
	
	
}
