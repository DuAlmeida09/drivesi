import java.util.Scanner;
class Treze {
	public static void main (String [] args) {
		Scanner s = new Scanner (System.in);
		System.out.println ("Digite quantos n�meros ter�o no arranjo:");
		int tamanho = s.nextInt();
		int [] numero = new int [tamanho];
		for (int i = 0; i<tamanho; i++) {
			Scanner sc = new Scanner (System.in);
			System.out.println ("Digite qual � o n�mero:");
			numero [i] = sc.nextInt();
		}
		
		for (int ult = numero.length - 1; ult > 0; ult--){
			for (int i = 0; i<ult; i++) {
				if (numero[i] > numero [i+1]) {
					int aux = numero[i];
					numero [i] = numero [i+1];
					numero [i+1] = aux;
				}
			}
		}
		
		System.out.println ("O valor m�ximo � " +numero [numero.length-1]+ " e o valor minimo � " +numero [0]);
	}
}