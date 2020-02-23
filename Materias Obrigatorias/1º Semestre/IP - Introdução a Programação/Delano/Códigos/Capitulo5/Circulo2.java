/**
 * Classe que representa circulos (vers�o 2)
 * 
 * @author Extraido do Livro: "Introdu��o � Ci�ncia da Computa��o com Java e Orienta��o a Objetos" - Capitulo 5
 */
class Circulo2 {
  double raio;
  
  void carregaRaio(double r) {
    raio = r;
  }
  
  double calculaArea() {
    return 3.1415*raio*raio;
  }
  
  double calculaPerimetro() {
    return 3.1415*2.0*raio;
  }
}

