/*********************************************************************/
/** ACH 2001 - Introdu��o � Ci�ncia da Computa��o I                 **/
/** EACH-USP - Primeiro Semestre de 2008                            **/
/** Turma 02 Matutino - Prof. Delano Medeiros Beder                 **/
/**                                                                 **/
/** Terceiro Exerc�cio-Programa                                     **/
/** Arquivo: Cadastro6411927.java                                   **/
/**                                                                 **/
/** Aluno Murilo Galv�o Hon�rio            N�Usp: 6411927           **/
/**                                                                 **/
/** Data da entrega: 23/06/2008                                     **/
/*********************************************************************/


class Cliente
{
     //atributos que armazenam respectivamente o nome e o telefone do cliente
     String nome;
     String telefone;
     
     //construtor do objeto Cliente
     Cliente(String nome, String telefone)
     {
          this.nome = nome;
          this.telefone = telefone;
     }

     //m�doto para obter o nome do cliente
     String getNome()
     {
          return this.nome;
     }
     
     //m�doto para obter o telefone do cliente
     String getTelefone()
     {
          return this.telefone;
     }
}



class CadastroDeClientes
{
     Cliente[] listaDeClientes = new Cliente[10];         //inicializa��o da lista com o tamanho m�ximo definido
     int tamanhoAtual = 0;                                //utilizada para determinar o tamanho atual da lista de clientes
     boolean listaOrdenada;                               //vari�vel que determina se a lista est� ordenada
     

     
     // Adiciona o cadastro de um novo cliente, no final da lista de clientes, na posi��o representada pelo
     // tamanho atual (pois as posi��es s�o contadas a partir de zero).
     // Se o novo cliente for adicionado com sucesso, o m�todo devolve 'true'. Caso contr�rio, devolve 'false'.
     boolean adicionaCliente(String nome, String telefone)
     {
          if (tamanhoAtual < listaDeClientes.length)  //teste que verifica se a opera��o n�o vai exceder o tamanho m�ximo permitido para o arranjo.
          {
               listaDeClientes[tamanhoAtual] = new Cliente(nome, telefone);
               tamanhoAtual++;
               listaOrdenada = false;  //por quest�es pr�ticas, devemos pressupor que ao adicionarmos um novo cadastro a lista ficar� desordenada.
               return true;
          }
          else
               return false;
     }
     
     
     
     // Realiza uma busca bin�ria pelo cadastro de um cliente utilizando como termo o nome procurado e devolvendo o telefone.
     // Caso o m�todo n�o encontre o cadastro, devolve uma String vazia.     
     String obtemTelefone(String nomeProcurado)
     {
          int esquerda = 0, direita = tamanhoAtual-1, meioAtual;
          
          // Teste para verificar a necessidade de ordenar a lista, pois isso s� faz sentido para lista que n�o se
          // encontra ordenada e cujo tamanho � maior do que um.
          if (listaOrdenada == false && tamanhoAtual > 1) 
               ordenaLista();
          
          while (esquerda <= direita) 
          {
               meioAtual = (direita + esquerda)/ 2;
               
               //inicializa��o da vari�vel que armazena o resultado da compara��o alfab�tica entre o nome procurado e o 
               //nome contido na atual posi��o do meio
               int compara��o = nomeProcurado.compareTo(listaDeClientes[meioAtual].getNome()); 
               
               //se a compara��o resultar 0 temos o nome desejado
               if(compara��o > 0)
                    esquerda = meioAtual + 1;
               else if(compara��o < 0)
                    direita = meioAtual - 1;
               else 
                    return listaDeClientes[meioAtual].getTelefone(); //ao encontrar o nome faz chamada do m�todo que devolve o telefone
          }
          return "";  //devolve string vazia
     }
     
     
     // Ordena a lista de clientes colocando seus nomes em ordem alfab�tica, utilizando o m�todo da bolha fornecido em aula.
     // Imprime a mensagem "Ordenando cadastros." quando chamado.
     void ordenaLista()         
     {
          System.out.println("Ordenando cadastros.");
          
          int i, j;
          int posFinal = tamanhoAtual-1;     //a posi��o final equivale ao tamanho atual da lista menos 1.
          Cliente auxiliar;                  //utilizado para efetuarmos as trocas entre os elementos.
          
          for(i = posFinal; i > 0 ; i--) 
          {
               // Varre o vetor desde o in�cio procurando erros de ordena��o. Como cada passagem o maior elemento sobe at� sua
               // posi��o correta, n�o h� necessidade de ir at� o final.
               for(j = 1; j <= i; j++) 
               {
                    // Caso em ordem alfab�tica o nome contido em "j-1" deva estar ap�s o contido em "j", compareTo devolve 
                    // maior que zero e, ent�o, a troca � realizada.
                    if (listaDeClientes[j-1].getNome().compareTo(listaDeClientes[j].getNome()) > 0) 
                    {
                         // Troca os dois de lugar
                         auxiliar = listaDeClientes[j-1];
                         listaDeClientes[j-1] = listaDeClientes[j];
                         listaDeClientes[j] = auxiliar;
                    }
               }
          }
          listaOrdenada = true;            //ao t�rmino das opera��es marca a lista como ordenada.
     }
     
     
     
     // Recebe um objeto do tipo CadastroDeClientes. Realiza a fus�o entre a lista de cadastros do objeto 'cadastros' recebido com
     // a lista local de cadastros. Nesta fus�o, cria um novo array que comporta todos os cadastros.
     void juntaCadastros(CadastroDeClientes cadastros)
     {
          // O primeiro bloco de c�digo verifica se as listas est�o ordenadas e ordena se necess�rio, pois
          // a fus�o seq�encial necessita de listas ordenadas.
          if (this.listaOrdenada == false && this.tamanhoAtual > 1)
               this.ordenaLista();
          if (cadastros.listaOrdenada == false && cadastros.tamanhoAtual > 1)
               cadastros.ordenaLista();
          
          //vari�veis utilizadas para varrer os vetores
          int posLocal = 0;  //posi��o na lista de clientes local
          int posReceb = 0;  //posi��o na lista de clientes recebida
          int posFundi = 0;  //posi��o na lista de clientes fundida
          
          // Utilizando o m�todo fus�o de seq��ncias ordenadas visto em aula, criamos uma lista fundida de 'Cliente' cujo tamanho
          // consiste da soma dos tamanhos das listas atuais.    
          Cliente[] listaFundida = new Cliente[this.tamanhoAtual + cadastros.tamanhoAtual];
          
          
          while ((posLocal < this.tamanhoAtual) && (posReceb < cadastros.tamanhoAtual))
          {
               if ((cadastros.listaDeClientes[posReceb].getNome().compareTo(this.listaDeClientes[posLocal].getNome())) <= 0) 
               {
                    listaFundida[posFundi] = cadastros.listaDeClientes[posReceb];
                    posReceb++;
               }
               else
               {
                    listaFundida[posFundi] = this.listaDeClientes[posLocal];
                    posLocal++;
               }
               posFundi++;
          }
          
          // Completamos a lista fundida com os elementos que sobraram.
          while (posLocal < this.tamanhoAtual)
          {
               listaFundida[posFundi] = this.listaDeClientes[posLocal];
               posFundi++;
               posLocal++;
          }
          while (posReceb < cadastros.tamanhoAtual)
          {
               listaFundida[posFundi] = cadastros.listaDeClientes[posReceb];
               posFundi++;
               posReceb++;
          }
          
          // Por fim, copiamos o conte�do da lista fundida para a lista de clientes local e atualizamos o tamanho atual da mesma.
          this.listaDeClientes = listaFundida;
          tamanhoAtual = listaDeClientes.length;
     }
     
}