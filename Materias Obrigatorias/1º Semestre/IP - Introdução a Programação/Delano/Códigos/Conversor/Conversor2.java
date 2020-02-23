/**
 * Classe que converte de Celsius para Fahrenheit (vers�o 2)
 * <p>
 * Limita��o: Apenas manipula n�meros inteiros
 * <p>
 * Quando o computador opera com n�meros inteiros, os n�meros s�o truncados, ou
 * seja "30.3" se torna "30" e "30.9" tamb�m se torna 30.
 * 
 * @author Extraido do Livro: "Introdu��o � Ci�ncia da Computa��o com Java e Orienta��o a Objetos" - Capitulo 3
 */
public class Conversor2{
  
/**
 * M�todo que converte de graus Celsius para graus Fahrenheit
 * 
 * @param c - graus celsius a ser convertido
 */
  int celsiusFahrenheit(int c) {
    return 9 * c / 5 + 32;
  }
  
}
