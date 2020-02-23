/**
 * Classe que converte de Celsius para Fahrenheit e Fahrenheit para Celsius (vers�o final)
 * 
 * @author Extraido do Livro: "Introdu��o � Ci�ncia da Computa��o com Java e Orienta��o a Objetos" - Capitulo 3
 */
public class Conversor4{
  
/**
 * M�todo que converte de graus Celsius para graus Fahrenheit
 * 
 * @param c - graus celsius a ser convertido
 */
 double celsiusFahrenheit(double c) {
     return 9 * c / 5 +   32;
 } 
 
/**
 * M�todo que converte de graus Fahrenheit para Celsius
 * 
 * @param f - graus fahrenheit a ser convertido
 */
 double fahrenheitCelsius(double f) {
     return 5 * (f - 32) / 9;
 } 
}