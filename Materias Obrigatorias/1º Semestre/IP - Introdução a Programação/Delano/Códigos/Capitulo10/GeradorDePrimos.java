class GeradorDePrimos {
  
  // Limite inferior para busca de um novo primo.
  
  int limiteInferior = 1;
  
  /*
   * Permite mudar o limite para c�mputo do pr�ximo primo.
   */
  
   void carregaLimiteInferior (int l) {
     limiteInferior = l;
   }
   
   /**
    * Verifica se um n�mero inteiro positivo � primo ou n�o.
    */
   boolean ehPrimo(int x) {
     
     if (x < 2) {
       return false;
     }
     
     // Todos os n�meros inteiros positivos s�o divis�veis por 1.
     
     int numeroDeDivisores = 1;
     
     // O primeiro candidato a divisor n�o trivial � o 2.
     
     int candidatoADivisor = 2;
     
     // Testa a divis�o por todos os n�meros menores ou iguais a x/2 ou
     // at� encontrar o primeiro divisor.
     
     while((candidatoADivisor <= x/2) && (numeroDeDivisores == 1)) {
       if (x % candidatoADivisor == 0) {
         numeroDeDivisores = numeroDeDivisores + 1;
       }
       candidatoADivisor = candidatoADivisor + 1;
     }
     
     // Imprime a resposta.
     
     if((numeroDeDivisores == 1))
       return true;
     else
       return false;
   }
   
   /**
    * A cada chamada, calculo um novo primo seguindo ordem crescente.
    */
   
   int proximoPrimo() {
     // Busca primeirol primo depois do limite.
     limiteInferior = limiteInferior + 1;
     while (!ehPrimo(limiteInferior)) {
       limiteInferior = limiteInferior+1;
     }
     return limiteInferior;
   }
   
   /**
    * Imprime a quantidade de primos (definida por par�metro) a partir de limite inferior.
    */ 
   
   void imprimePrimos(int quantidade) {
     int limiteInferiorAnterior;
     limiteInferiorAnterior = limiteInferior;
     System.out.println("Os " + quantidade + " numeros primos a partir de " + limiteInferior + ":");
     while(quantidade > 0) {
       System.out.print(proximoPrimo() + " ");
       quantidade = quantidade - 1;
     }
     
     // Recoloca o limite inferior anterior
     carregaLimiteInferior(limiteInferiorAnterior);
   }
}