/*********************************************************************/
/** ACH 2001 - Introdu��o � Ci�ncia da Computa��o I                 **/
/** EACH-USP - Primeiro Semestre de 2008                            **/
/** Turma do Matutino - Prof Delano Medeiros Beder                  **/
/**                                                                 **/
/** Primeiro Exerc�cio-Programa                                     **/
/** Arquivo: Banco6411927.java                                      **/
/**                                                                 **/
/** Murilo Galv�o Hon�rio                                           **/
/** USP 6411927                                                     **/
/** 02 de Abril de 2008                                             **/
/*********************************************************************/

public class Banco6411927
{  

        int um = 0;                         //inicializa��o da vari�vel que armazena a quantidade de notas de um duca
        int cinco = 0;                      //inicializa��o da vari�vel que armazena a quantidade de notas de cinco ducas
        int dez = 0;                        //inicializa��o da vari�vel que armazena a quantidade de notas de dez ducas
        int cinquenta = 0;                  //inicializa��o da vari�vel que armazena a quantidade de notas de cinquenta ducas
        int cem = 0;                        //inicializa��o da vari�vel que armazena a quantidade de notas de cem ducas
            
        
        // O m�todo carregaValores especifica o n�mero notas de cada tipo, pegando as vari�veis do tipo inteiro
        // a, b, c, d, e, e passando os valores paras as vari�veis fora do m�todo na seguinte ordem: cem, cinquenta, dez, cinco e um.
        void carregaValores(int a, int b, int c, int d, int e) //m�todo que define o n�mero inicial para cada nota
        {
            if (a >= 0 && b >= 0 && c >= 0 && d >= 0 && e >= 0)    //s� pra testar se o esperto n�o est� tentando passar um n�mero negativo de notas
            {
                cem = a;
                cinquenta = b;
                dez = c;
                cinco = d;
                um = e;
            }
            else
            {
                System.out.println("Insira n�meros de notas v�lidos.");
            }
        }
        

        // O m�todo saque pede o valor que o cliente deseja sacar, efetua as verifica��es, c�lculos e opera��es pertinentes e exibe as mensagens correspondentes.
        void saque(int valorDesejado) 
        {
            int valorRetirado = 0;                                              //guarda a quantidade de dinheiro retirada a cada passagem dos comandos while
            int saldo = (um*1)+(cinco*5)+(dez*10)+(cinquenta*50)+(cem*100);     //c�lculo do saldo atual atribuindo valores � quantidade de notas
            int tiraDeCem = 0;                                                  //conta a quantidade de notas de cem retiradas do caixa. O mesmo vale para as seguintes. ;)
            int tiraDeCinquenta = 0;
            int tiraDeDez = 0;
            int tiraDeCinco = 0;
            int tiraDeUm = 0;
            if (valorDesejado > 0)    //teste se n�o est� tentando pedir um valor negativo ou zero
            {
            // Primeiro, testamos se h� dinheiro suficiente no caixa, ou seja, se o saldo � maior ou igual ao valor desejado pelo cliente.
                if (saldo >= valorDesejado)            
                {
                // Para a execu��o do comando while ambas express�es precisam ser verdadeiras. As express�es para os valores 50, 10, 5 e 1 s�o an�logas.
                // O teste "cem > tiraDeCem" tem as seguintes finalidades: na primeira passagem, testa se existem notas de cem, comparando cem > 0 
                // (definida no in�cio do m�todo), passando para o pr�ximo while caso cem = 0; nas demais passagens garante que n�o se ultrapasse o n�mero
                // m�ximo de notas de cem, pois quando cem = tiraDeCem, retornar� false.
                // Por fim, o teste "valorDesejado >= (valorRetirado+100)" serve para proibir que o valorRetirado no corpo do while ultrapasse o valorDesejado pelo usu�rio.
                    while (cem > tiraDeCem && valorDesejado >= (valorRetirado+100) )
                    {
                        tiraDeCem++;                            //conta a quantidade de notas de cem retiradas a cada passagem, efetuando o incremento
                        valorRetirado = valorRetirado+100;
                    }
                    while (cinquenta > tiraDeCinquenta && valorDesejado >= (valorRetirado+50) )
                    {
                        tiraDeCinquenta++;
                        valorRetirado = valorRetirado+50;
                    }
                    while (dez > tiraDeDez && valorDesejado >= (valorRetirado+10) )
                    {
                        tiraDeDez++;
                        valorRetirado = valorRetirado+10;
                    }
                    while (cinco > tiraDeCinco && valorDesejado >= (valorRetirado+5) )
                    {
                        tiraDeCinco++;
                        valorRetirado = valorRetirado+5;
                    }
                    while (um > tiraDeUm && valorDesejado >= (valorRetirado+1) )
                    {
                        tiraDeUm++;
                        valorRetirado = valorRetirado+1;
                    }
                    // Ap�s a execu��o das in�meras passagens, testamos se o objetivo foi atingido, ou seja se o valorRetirado � igual ao valorDesejado.
                    // Em caso positivo, exibe mensagens para o usu�rio e atualiza as quantidades de notas.
                    if (valorRetirado == valorDesejado)
                    {
                        System.out.println("Saque autorizado.");
                        System.out.println("Voc� sacou " +valorRetirado+ " ducas.");
                        System.out.println("Nesta opera��o, o caixa forneceu:");
                        System.out.println("Notas de 100: " +tiraDeCem+ ", notas de 50: " +tiraDeCinquenta+ ", notas de 10: " +tiraDeDez+ ", notas de 5: " +tiraDeCinco+ ", notas de 1: " +tiraDeUm+ ".");
                        System.out.println("-----------------------------------------------------------------------------------");
                        // A pr�xima parte de c�digo atualiza a quantidade de notas, efetuando as subtra��es e passando os valores para as vari�veis definidas fora do metodo.
                        cem = cem - tiraDeCem;
                        cinquenta = cinquenta - tiraDeCinquenta;
                        dez = dez - tiraDeDez;
                        cinco = cinco - tiraDeCinco;
                        um = um - tiraDeUm;
                    }
                    // Obviamente o caixa n�o possui a quantidade de notas necess�ria para o saque, pois a condi��o de 
                    // ter ou n�o saldo foi testada no in�cio do m�todo. Exibe a mensagem correspondente.
                    else   
                    {
                        System.out.println("Saque n�o autorizado.");
                        System.out.println("Este terminal n�o possui notas suficientes para concluir a opera��o.");
                        System.out.println("Por favor, dirija-se � outro caixa ou tente novamente mais tarde.");
                        System.out.println("-----------------------------------------------------------------------------------");
                    }
                }
                //Caso o valor desejado pelo cliente seja superior ao saldo, n�o autoriza o saque e apenas informa o saldo atual.
                else       
                {
                    System.out.println("Saque n�o autorizado.");
                    System.out.println("Voc� deseja retirar " +valorDesejado+ " ducas, por�m o saldo atual � de somente " +saldo+ ".");
                    System.out.println("Efetue um saque de menor valor ou fale com o gerente.");
                    System.out.println("-----------------------------------------------------------------------------------");
                }
            }
            else
            {
                System.out.println("O valor desejado deve ser maior do que 0.");
            }
        }
        
        
        // O m�todo deposito adiciona o valor definido em a,b,c,d,e � quantidade de nota de cada tipo e imprime a nova quantidade de notas.
        void deposito(int a, int b, int c, int d, int e) 
        {
            if (a >= 0 && b >= 0 && c >= 0 && d >= 0 && e >= 0)    //primeiro testa se o camarada n�o est� digitando um n�mero negativo
            {
                cem = cem+a;
                cinquenta = cinquenta+b;
                dez = dez+c;
                cinco = cinco+d;
                um = um+e;
                int saldo = (um*1)+(cinco*5)+(dez*10)+(cinquenta*50)+(cem*100); //o velho c�lculo do saldo atual. 
                System.out.println("Dep�sito confirmado.");
                System.out.println("Saldo atual: " +saldo+ " ducas.");
                System.out.println("Notas de 100: " +cem+ ", notas de 50: " +cinquenta+ ", notas de 10: " +dez+ ", notas de 5: " +cinco+ ", notas de 1: " +um+ ".");
                System.out.println("-----------------------------------------------------------------------------------");
            }
            else
            {
                System.out.println("Dep�sito n�o autorizado. Insira n�meros positivos para as notas.");
            }
        }
        
        
        // M�todo que calcula o saldo, exibindo a mensagem apropriada e a quantidade de notas dispon�veis.
        void imprime()
        {
            int saldo = (um*1)+(cinco*5)+(dez*10)+(cinquenta*50)+(cem*100);
            if (saldo==0){
                System.out.println("Este caixa n�o possui ducas no momento.");
                System.out.println("Notas de 100: " +cem+ "; notas de 50: " +cinquenta+ "; notas de 10: " +dez+ "; notas de 5: " +cinco+ "; notas de 1: " +um+ ".");
                System.out.println("-----------------------------------------------------------------------------------");
            }
            else if (saldo==1){
                System.out.println("O saldo atual � de " + saldo + " duca.");
                System.out.println("Notas de 100: " +cem+ "; notas de 50: " +cinquenta+ "; notas de 10: " +dez+ "; notas de 5: " +cinco+ "; notas de 1: " +um+ ".");
                System.out.println("-----------------------------------------------------------------------------------");
            }
            else {
                System.out.println("O saldo atual � de " + saldo + " ducas.");
                System.out.println("Notas de 100: " +cem+ "; notas de 50: " +cinquenta+ "; notas de 10: " +dez+ "; notas de 5: " +cinco+ "; notas de 1: " +um+ ".");
                System.out.println("-----------------------------------------------------------------------------------");
            }
        }
        
}

// Obs.: no c�digo original criei um m�todo saldo() que evitava essa repeti��o do c�lculo "(um*1)+(cinco*5)+(dez*10)+(cinquenta*50)+(cem*100)" presente
// em todos os m�todos, mas fiquei na d�vida se isso seria considerado, portanto retirei desta vers�o final.