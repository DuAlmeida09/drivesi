/*********************************************************************/
/** ACH 2001 - Introdu��o � Ci�ncia da Computa��o I                 **/
/** EACH-USP - Primeiro Semestre de 2008                            **/
/** Turma Matutino - Delano Medeiros Beder                          **/
/**                                                                 **/
/** Segundo Exerc�cio-Programa                                      **/
/** Arquivo: 6411927.zip                                            **/
/**                                                                 **/
/** Murilo Galv�o Hon�rio - USP 6411927                             **/
/**                                                                 **/
/** 02/06/2008                                                      **/
/*********************************************************************/

class Rotas
{
     int cidadeIntermediaria;              //armazena o �ndice da cidade utilizada como escala
     int cidadeA;                          //armazena o �ndice da cidade da partida
     int cidadeB;                          //armazena o �ndice da cidade de destino

     /* As duas vari�veis abaixo inicializam respectivamente um arranjo do tipo String com o nome das capitais
      * e uma matriz que reproduz a tabela de Dist�ncias a�reas fornecida pelo exerc�cio. 
      */
     String[] cidades = {"Aracaju", "Fortaleza", "Jo�o Pessoa", "Macei�", "Natal", "Recife", "Salvador", "S�o Lu�s", "Teresina"};
     int[][] distanciasAereas = new int[][]{{0, 812, 418, 210, 550, 398, 267, 1218, 1272}, 
                                      {812, 0, 562, 730, 444, 640, 1018, 640, 432},
                                      {418, 562, 0, 284, 144, 110, 758, 1208, 987},
                                      {210, 730, 284, 0, 423, 191, 464, 1220, 1126},
                                      {550, 444, 144, 423, 0, 252, 852, 1064, 843},
                                      {398, 640, 110, 191, 252, 0, 654, 1197, 935},
                                      {267, 1018, 758, 464, 852, 654, 0, 1319, 1000},
                                      {1218, 640, 1208, 1220, 1064, 1197, 1319, 0, 320},
                                      {1272, 432, 987, 1126, 843, 935, 1000, 320, 0}};
     
     /* M�todo que verifica as cidades digitadas pelo usu�rio, atribuindo um valor de �ndice correspondente
      * para cada uma delas. Caso alguma das duas cidades n�o conste no arranjo 'cidades[]', atribui o valor -1,
      * que ser� utilizado nos testes l�gicos do m�todo 'calculaViagem' para exibir as mensagens pertinentes.
      */
     void encontrarIndice(String x, String y)
     {
          cidadeA = -1;   //atribui �ndice para a cidade de partida, para o caso de n�o haver correspond�ncia em 'cidades'
          cidadeB = -1;   //atribui �ndice para a cidade de destino, para o caso de n�o haver correspond�ncia em 'cidades'
          
          /* O la�o abaixo varre o arranjo 'cidades' em busca das cidades digitadas pelo usu�rio,
           * atribuindo o valor do �ndice caso encontrem. Foi utilizado 'equalsIgnoreCase' para 
           * permitir uma leitura mais abrangente, com letras mai�sculas ou min�sculas.
           */
          for (int i = 0; i < cidades.length; i++)
          {
               if (x.equalsIgnoreCase(cidades[i]))
                    cidadeA = i; 
               if (y.equalsIgnoreCase(cidades[i]))
                    cidadeB = i;
          }
     }
     
     
     /* Este m�todo l� duas cidades digitadas pelo usu�rio, ent�o chama o m�todo 'encontrarIndice', explicado acima.
      * Se os �ndices da partida e destino (cidadeA, cidadeB) forem iguais, exibe a mensagem apropriada.
      * O segundo teste verifica a exist�ncia das cidades digitadas em 'cidades[]', pois o m�todo 'encontrarIndice'
      * atribui '-1' caso n�o as encontre. Sendo assim, n�o ser� poss�vel calcular a rota e ser�o exibidas as mensagens
      * pertinentes. Por fim, se as cidades digitadas passarem por todos os testes a rota adequada ser� calculada.
      */
     void calculaViagem(String x, String y)
     {
          encontrarIndice(x,y);              // chamada do m�todo que efetua a verifica��o dos nomes das cidades digitadas pelo usu�rio.
          if (cidadeA == cidadeB)            // compara se a mesma cidade foi digitada duas vezes
               System.out.println("A mesma cidade foi digitada como partida e destino, n�o h� rota aplic�vel.");
          else if ((cidadeA < 0) || (cidadeB < 0))      //caso o m�todo 'encontrarIndice' n�o consiga determinar alguma das cidades, a condi��o ser� satisfeita.
          {
               System.out.println("N�o � poss�vel determinar a menor rota entre " + x + " e " + y + ".");
               System.out.println("Favor verificar a acentua��o ou se as cidades digitadas s�o capitais da regi�o Nordeste.");
          }
          
          /* Os �ndices s�o utilizados para a realiza��o do seguinte teste:
           * Ao apontar para a posi��o na matriz 'distanciasAereas' referente aos �ndices cidadeA e cidadeB,
           * se a dist�ncia � menor que 400 Km, exibe a mensagem apropriada. Caso contr�rio, calcula qual a
           * rota mais adequada.
           */
          else
          {
               if (distanciasAereas[cidadeA][cidadeB] < 400)  // conforme determinado no exerc�cio, se a dist�ncia for menor que 400 Km o v�o n�o ter� escalas.
               {
                    System.out.println("A menor rota � " + cidades[cidadeA] + "/" + cidades[cidadeB] + " com " + distanciasAereas[cidadeA][cidadeB] + "Km.");
               }
               
               /* Sabendo-se que a dist�ncia � maior que 400 Km, testa todas as combina��es de viagens com escala
                * poss�veis (mediante cidadeA -> escala -> cidadeB), determina qual a menor e imprime a rota.
                */
               else
               {
                    /* As vari�veis s�o inicializadas com valores arbitr�rios maiores que a dist�ncia entre duas cidades quaisquer,
                     * para que a express�o 'if (distanciaComEscala < menorDistancia)' seja v�lida desde a primeira passagem.
                     */
                    int distanciaComEscala = 10000;                                // a soma da dist�ncia entre as tr�s cidades (A at� a escala + escala at� B)
                    int menorDistancia = 10000;                                    // a menor dist�ncia com escala encontrada at� o momento
                    for (int escala = 0; escala < distanciasAereas[cidadeA].length; escala++) //todas as cidades de escala poss�veis ser�o testadas. 
                    {
                         if ((distanciasAereas[cidadeA][escala] != 0) && (distanciasAereas[escala][cidadeB] != 0))   // Dist�ncia zero trata-se da mesma cidade, portanto desconsideramos.
                         {
                              distanciaComEscala = distanciasAereas[cidadeA][escala] + distanciasAereas[escala][cidadeB];  //somamos as dist�ncias
                              if (distanciaComEscala < menorDistancia)             //teste para verificar se esta � a dist�ncia mais curta
                              {
                                   menorDistancia = distanciaComEscala;            //armazena a dist�ncia calculada previamente
                                   cidadeIntermediaria = escala;                   //guarda o �ndice da cidade utilizada como escala
                              }
                         }
                    }
                    System.out.println("A menor rota � " + cidades[cidadeA] + "/" + cidades[cidadeIntermediaria] + "/" + cidades[cidadeB] + " com " + menorDistancia + "Km.");
               }
          }
     }
}