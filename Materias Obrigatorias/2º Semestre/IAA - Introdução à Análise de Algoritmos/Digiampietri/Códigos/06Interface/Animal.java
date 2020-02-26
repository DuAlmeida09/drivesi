package interfaces;

import java.util.Date;

public interface Animal {
	/* Interfaces em Java s� contem a interface dos m�todos (sem corpo) e
	 * pondem conter constantes (declaradas como atributos), podem ou
	 * n�o ter os modificadores static e final (funcionar�o como se tivessem) */

	int constanteDaInterface = 5;
	
	// a assinatura de um m�todo em uma interface pode ter os seguintes modificadores:
	// <nada>, public, abstract
	void nas�a(Date dataDeNascimento);
	void tipo();
	void durma();
	double peso();

}
