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

class Estatistica
{
     double[] cole��oDeValores;         //O arranjo de valores digitado pelo usu�rio
     int quantidadeDeItens;             //A quantidade de valores armazenada na cole��o, equivale ao comprimento do arranjo 'cole��oDeValores'

     void carregaValores(double[] valores)
     {
          quantidadeDeItens = valores.length;               //passa o comprimento do arranjo criado pelo usu�rio 
          cole��oDeValores = valores;                       //inicializa a cole��oDeValores com os valores digitados pelo usu�rio
          /*
           * cole��oDeValores = new double[n];
           * for (int i = 0; i < n; i++)
           * {
           *    colecao[i] = valores[i];
           * }
           */
     }
     
     
     double media()    //m�dia aritm�tica: soma todos os valores e divide pela quantidade de itens
     {
          double soma = 0;
          for (int i = 0; i < quantidadeDeItens; i++) //o la�o soma todos os n�meros contidos na 'cole��oDeValores'
          {
               soma = soma + cole��oDeValores[i];
          }
          return soma/quantidadeDeItens;
     }

     double moda()    //M�todo exibe uma das modas encontrada, conforme orienta��o do professor.
     {
          double moda = 0.0;                  //Inicializa a moda que ser� calculada
          int contadorDeIguais = 0;           //Armazena a quantidade de valores iguais em cada passagem 
          int maiorNumeroDeIguais = 0;        //Guarda a maior quantidade de valores iguais encontrada 
          //O la�o abaixo varre o arranjo 'cole��oDeValores' comparando um valor com os demais
          for (int i = 0; i < quantidadeDeItens; i++)
          {
               for (int j = 0; j < quantidadeDeItens; j++)
               {
                    if (cole��oDeValores[i] == cole��oDeValores[j])  //Testa se os valores contidos na posi��o i e j da 'cole��oDeValores' s�o iguais
                         contadorDeIguais++;                         //Atualiza a contagem dos valores iguais encontrados
               }
               if (contadorDeIguais >= maiorNumeroDeIguais)  //Caso a contagem seja a maior encontrada at� o momento, armazena a respectiva moda.
               {
                    moda = cole��oDeValores[i]; 
                    maiorNumeroDeIguais = contadorDeIguais;  //Atualiza a maior quantidade encontrada.
               }
               contadorDeIguais = 0;                         //Reseta o contador para a pr�xima itera��o.
          }
          return moda;
     }
     
     double amplitude()    //diferen�a entre o maior e o menor valores
     {
          double menor = cole��oDeValores[0];   //inicializa o menor valor arbitrariamente com o primeiro valor da cole��o
          double maior = cole��oDeValores[0];   //inicializa o maior valor arbitrariamente com o primeiro valor da cole��o
          //o la�o abaixo verifica sucessivamente se um valor � menor/maior que o anterior.
          for (int i = 0; i < quantidadeDeItens; i++)
          {
               if (cole��oDeValores[i] < menor)
                    menor = cole��oDeValores[i];   //se o valor encontrado � menor que o anterior, armazena.
               if (cole��oDeValores[i] > maior)
                    maior = cole��oDeValores[i];   //se o valor encontrado � maior que o anterior, armazena.
          }
          double amplitude = maior - menor;        //efetua o c�lculo da amplitude e atribui o resultado para a vari�vel amplitude
          return amplitude;
     }
     
     double desvioPadrao()           //raiz quadrada da m�dia aritm�tica dos quadrados dos desvios em rela��o � m�dia
     {
          double somatorio = 0;         //a soma dos quadrados dos desvios
          double media = media();       //chama o m�todo que calcula a m�dia da cole��oDeValores
          //o la�o abaixo calcula a soma dos quadrados dos desvios, elemento por elemento.
          for (int i = 0; i < quantidadeDeItens; i++)
          {
               somatorio = somatorio + (cole��oDeValores[i]-media)*(cole��oDeValores[i]-media);  //o desvio � definido por: cole��oDeValores[i]-media
          }
          double desvioPadrao = Math.sqrt(somatorio/quantidadeDeItens);  //atrav�s da chamada Math.sqrt efetua a raiz quadrada da m�dia aritm�tica dos quadrados dos desvios
          return desvioPadrao;
     }
}