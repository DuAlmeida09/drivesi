/**
 * Classe simples que inverte inteiros de 2, 3 ou 4 algarismos (digito). Apenas funciona para inteiros de 2, 3 ou 4 algarismos. 
 * Futuramente iremos ver um algoritmo mais sofisticado que funciona com qualquer n�mero de algarismos.
 * 
 * Um n�mero inteiro � pal�ndromo se o inverso desse n�mero � igual a ele. Exemplos: 1, 11, 121, 232, 2002.
 * 
 * OBS: O inverso de um n�mero inteiro de apenas 1 algarismo � ele pr�prio. Exemplo: o inverso de "9" � "9".
 * 
 */
public class Inverte {
  
  /**
   * M�todo que inverte um n�mero de dois algarismos.
   * 
   * @param n n�mero de dois algarismos.
   */
  public int inverte2(int n) {
    if (n >= 10 && n <= 99) {
      int d = n / 10;
      int u = n % 10;
      return u * 10 + d;
    }
    else {
      System.out.println("Infelizmente esse m�todo apenas inverte n�meros de dois algarismos.");
      return -1;
    }
  }
  
  /**
   * M�todo que inverte um n�mero de tr�s algarismos.
   * 
   * @param n n�mero de tr�s algarismos.
   */
  public int inverte3(int n) {
    if (n >= 100 && n <= 999) {
      int c = n / 100;
      n = n % 100;
      int d = n / 10;
      int u = n % 10;
      return u * 100 + d * 10 + c;
    }
    else {
      System.out.println("Infelizmente esse m�todo apenas inverte n�meros de tr�s algarismos.");
      return -1;
    }
  }
  
  /**
   * M�todo que inverte um n�mero de quatro algarismos.
   * 
   * @param n n�mero de quatro algarismos.
   */
  public int inverte4(int n) {
    if (n >= 1000 && n <= 9999) {
      int m = n / 1000;
      n = n % 1000;
      int c = n / 100;
      n = n % 100;
      int d = n / 10;
      int u = n % 10;
      return u * 1000 + d * 100 + c * 10 + m;
    }
    else {
      System.out.println("Infelizmente esse m�todo apenas inverte n�meros de quatro algarismos.");
      return -1;
    }
  }
  
  public boolean palindromo(int n) {  
    if (n >= 0 && n <= 9) { // apenas 1 digito
      return true;
    }
    else if (n >=10 && n <= 99) { // 2 digitos
      return n == inverte2(n);
    }
    else if (n >= 100 && n <= 999) { // 3 digitos
      return n == inverte2(n);
    }
    else if (n >= 1000 && n <= 9999) { // 4 digitos
      return n == inverte4(n);
    } else {
      System.out.println("Infelizmente esse m�todo apenas funciona com n�meros de um a quatro algarismos.");
      return false;
    }
  }
  
}