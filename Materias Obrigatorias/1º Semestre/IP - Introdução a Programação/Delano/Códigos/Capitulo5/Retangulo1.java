/**
 * Classe que representa retangulos (vers�o 1)
 * 
 * @author Extraido do Livro: "Introdu��o � Ci�ncia da Computa��o com Java e Orienta��o a Objetos" - Capitulo 5
 */
class Retangulo1 {
  
  int calculaArea(int lado1, int lado2) {
    return lado1 * lado2;
  }
  
  int calculaPerimetro(int lado1, int lado2) {
    return 2 * (lado1 + lado2);
  }
}