package ep2;

/*
	Classe para testes com o rob�
*/
public class TestaRobo {
	/*
		Testes com o rob�
	*/
	public static void main(String[] args) {
		/* teste 1 - OK */
		IRobo robo = new Robo();
		
		robo.adicionaBloco(1,2);
		
		robo.adicionaBloco(2,1);
		
		robo.adicionaBloco(5,5);
		
		robo.adicionaBloco(9,9);
		
		robo.adicionaObstaculo(2,0);
		
		robo.adicionaObstaculo(3,2);
		
		robo.buscaBlocos();
		
	
		/* teste 2 - N�mero inferior de blocos
		IRobo robo = new Robo();
		
		robo.adicionaBloco(1,2);
		
		robo.adicionaBloco(2,1);
		
		robo.adicionaObstaculo(2,0);
		
		robo.adicionaObstaculo(3,2);
		
		robo.buscaBlocos();
		*/
		
		/* teste 3 - Bloco isolado por obst�culos 
		IRobo robo = new Robo();
		
		robo.adicionaBloco(1,2);
		
		robo.adicionaBloco(2,1);
		
		robo.adicionaBloco(5,5);
		
		robo.adicionaBloco(9,9);
		
		robo.adicionaObstaculo(2,0);
		
		robo.adicionaObstaculo(3,2);
		
		robo.adicionaObstaculo(9,8);
		
		robo.adicionaObstaculo(8,9);
		
		robo.buscaBlocos(); */
	}
}
