package heranca;

public class AlunoRegular extends Aluno{
	/* J� que aluno n�o tem construtor sem par�metros � necess�rio criar um construtor aqui */
	AlunoRegular(String nome, int RG, int NUSP){
		super(nome,RG,NUSP);
	}
	
	void estudarMuito(){
		System.out.println("Estudando muito!");
	}
	
	// PRECISA implementar todos os m�todos abstratos da super-classe
	void estudar(){
		System.out.println("Aluno Regular Estudando");
	}
}
