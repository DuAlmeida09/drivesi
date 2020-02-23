class Triangulo {
    int Cor;
    public static void main (String args[]) {
       int MARROM=1, VERMELHO=2, VERDE=3;
       Triangulo T1, T2, T3;
       T1 = new Triangulo();
       T2 = new Triangulo();
       T3 = new Triangulo();
       T1.Cor=VERMELHO;
       T2.Cor=VERDE;
       T3.Cor=MARROM;
       System.out.println (T1.Cor);
       System.out.println (T2.Cor);
       System.out.println (T3.Cor);
    }
}
/* Esta construcao - colocar main como metodo estatico da 
 * (unica) classe, embora estranho eh permitido, usual e 
 * nao eh m� pr�tica de programacao.
 * */
/* Neste codigo, a classe Triangulo tem um atributo (Cor)
 * e um metodo (main) */
/* Cor eh do tipo inteiro e cont�m o n�mero correspondente
 * aa cor, definida em algum outro lugar. */
/* Em main, s�o definidas "constantes" que codificam as
 * cores e tr�s vari�veis que conter�o refer�ncias para 
 * objetos da classe Triangulo. */
/* Os objetos s�o criados (alocados e inicializados) atrav�s
 * do operador new, que retorna a refer�ncia para o objeto,
 * que � armazenada na vari�vel. */
/* O atributo � acessado diretamente, e recebe o valor 
 * correspondente a uma cor. */
/* Imprimir a cor resulta na impress�o do n�mero que a 
 * representa. */
/* O que n�o est� bom aqui:
 * 1-) main como m�todo da classe Triangulo;
 * 2-) Cor como um inteiro (embora seja o correto 
 *     em outras linguagens, e seja pr�tica comum,
 *     permite atribuir a Cor valores que n�o representam 
 *     cores. � poss�vel dar solu��o melhor em JAVA; 
 * 3-) Atributos da classe s�o diretamente modific�veis,
       o que exp�e a implementa��o. */
/* O que est� bom:
 * 1-) Indenta��o */
