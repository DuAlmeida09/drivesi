package heranca;

// A classe Aluno � abstrata (n�o pode ser instanciada)
abstract class Aluno extends Pessoa {
	String nome;
	int RG;
	int numeroUSP;
	
	/* construtores n�o podem ser final */
	Aluno(String n, int rg, int nUSP){
		super(n,rg);
		numeroUSP = nUSP;
	}
	
	void respirar(){
		System.out.println("Aluno respirando.");
	}

	final void fazerTrabalhos(){
		System.out.println("Trabalhando.");
	}
	
	// M�todo abstrato, precisa ser implementado nas sub-classes n�o abstratas
	// um m�todo n�o pode ser abstrato e est�tico ao mesmo tempo
	abstract void estudar();
}
