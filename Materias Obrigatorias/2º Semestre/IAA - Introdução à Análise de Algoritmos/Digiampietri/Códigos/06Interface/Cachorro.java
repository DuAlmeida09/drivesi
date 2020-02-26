package interfaces;

import java.util.Date;

/* A classe Cachorro PRECISA implementar todos os metodos definidos na 
 * Interface Animal, al�m disso pode ter outros atributos e m�todos
 */
public class Cachorro implements Animal{

	private int peso;
	
	Cachorro(int peso){
		this.peso = peso;
	}
	
	public void durma() {
		System.out.println("Dormindo.");
	}

	public void nas�a(Date data) {
		System.out.println("Nascendo um novo cachorro: " + data);
	}

	public double peso() {
		return peso;
	}

	public void tipo() {
		System.out.println("Este animal eh um Cachorro.");
	}
}
