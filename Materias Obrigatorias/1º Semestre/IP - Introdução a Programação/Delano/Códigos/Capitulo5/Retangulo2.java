/**
 * Classe que representa retangulos (vers�o 2)
 * 
 * @author Extraido do Livro: "Introdu��o � Ci�ncia da Computa��o com Java e Orienta��o a Objetos" - Capitulo 5
 */
class Retangulo2 {
  int lado1;
  int lado2;
  
  int calculaArea() {
    return lado1 * lado2;
  }
  
  int calculaPerimetro() {
    return 2 * (lado1 + lado2);
  }
  
  void carregaLados(int l1, int l2) {
    lado1 = l1;
    lado2 = l2;
  }
}