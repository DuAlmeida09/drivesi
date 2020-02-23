/*
	Programa para calcular a �rea de uma casa (e seus c�modos) de 3
	c�modos: uma sala de 10X10m, um banheiro e um quarto de 5X7m cada.
*/
class AreaCasa {
/* Calcula �rea da casa */
	static void areaCasa(float lateral, float cquarto) {
		float areaq; // �rea do quarto
		float areas; // �rea da sala
		float areat; // �rea total

		System.out.println ("Programa para c�lculo \nda �rea da casa");
		// c�lculo da �rea da sala
		areas = lateral*lateral;
		System.out.println ("A �rea da sala � " +areas);
		// c�lculo da �rea do banheiro
		areaq = cquarto*(lateral/2);
		System.out.println ("A �rea do banheiro � " +areaq);
		// c�lculo da �rea do quarto
		System.out.println ("A �rea do quarto � " +areaq);
		// c�lculo da �rea total
		areat = areas + 2*areaq;
		System.out.println ("A �rea total � " +areat); 
}		
/* Calcula a �rea da piscina */
	static double areaPiscina (double raio) {
		// c�lculo da �rea da piscina
		return Math.PI*raio*raio;
}	
	public static void main(String[] args) {
		double areap; // �rea da piscina
		areap = areaPiscina (2);

		areaCasa(11,7);
		areaPiscina(2);
		System.out.println ("A �rea da piscina � " +areap);
	}
}