package interfaces;

import java.util.Date;

/* A classe Morcego PRECISA implementar todos os metodos definidos nas 
 * interfaces Animal e Voador. Note que se as duas interfaces t�m m�todos com
 * assinaturas/cabe�alhos id�nticos isto n�o � um problema, por�m se s�o m�todos
 * com os mesmos nomes e par�metros por�m com tipos de retorno diferentes, 
 * da� n�o � poss�vel implementar as duas interfaces.
 */
public class Morcego implements Animal, Voador {

	public Date dataDeNascimento;
	
	public void durma() {
		System.out.println("Dormindo de cabe�a para baixo.");
	}

	public void nas�a(Date data) {
		dataDeNascimento = data;
		System.out.println("Nascendo um novo morcego");
	}

	public double peso() {
		return 1.5*constanteDaInterface;
	}

	public void tipo() {
		System.out.println("Este animal eh um Morcego.");
	}

	public void aterrisse() {
		System.out.println("Aterrissando.");
	}

	// Ao implementar m�todos de uma interface, o m�todo N�O pode ser est�tico
	public void voe() {
		System.out.println("Levantando voo.");
	}
	

}
