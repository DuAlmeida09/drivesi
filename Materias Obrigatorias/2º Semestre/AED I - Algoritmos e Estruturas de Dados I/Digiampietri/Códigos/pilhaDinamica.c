/******************************************************************************
//     pilhaDinamica.c
// Este programa gerencia pilhas (implementacao dinamica).
// As pilhas gerenciadas podem ter um numero arbitrario de elementos.
// N�o usaremos sentinela ou cabe�a nesta estrutura.
******************************************************************************/
#include <stdio.h>
#include <malloc.h>
#define true 1
#define false 0

typedef int bool;
typedef int TIPOCHAVE;

typedef struct tempRegistro{
  TIPOCHAVE chave;
  struct tempRegistro *prox;
// outros campos...
} REGISTRO;

typedef REGISTRO* PONT;

// o ponteiro topo aponta para o topo da pilha (ser� NULL caso a pilha esteja vazia)
typedef struct {
  PONT topo;
} PILHA;

/* Inicializa��o da pilha ligada (a pilha jah esta criada e eh apontada 
pelo endereco em l) */
void inicializarPilha(PILHA *l){
  l->topo = NULL;
} /* inicializarPilha */

/* Exibi��o da pilha seq�encial */
void exibirPilha(PILHA *l){
  PONT end = l->topo;
  printf("Pilha: \" ");
  while (end != NULL){
    printf("%d ", end->chave); // soh lembrando TIPOCHAVE = int
    end = end->prox;
  }
  printf("\"\n");
} /* exibirPilha */ 

/* Retornar o tamanho da pilha (numero de elementos) */
int tamanho(PILHA *l) {
  PONT end = l->topo;
  int tam = 0;
  while (end != NULL){
    tam++;
    end = end->prox;
  }
  return tam;
} /* tamanho */

/* Retornar o tamanho em bytes da pilha. Neste caso, isto depende do numero
   de elementos que estao sendo usados.   */
int tamanhoEmBytes(PILHA *l) {
  return(tamanho(l)*sizeof(REGISTRO))+sizeof(PILHA); // sizeof(PILHA) = sizeof(PONT) pois a "PILHA" eh um ponteiro para o 1o elemento
} /* tamanhoEmBytes */

/* Exclus�o do elemento do topo da pilha e copia deste elemento para o
   endere�o apontado por reg */
bool excluirElemPilha(PILHA *l, REGISTRO* reg){
  if ( l->topo == NULL) return false;
  *reg = *(l->topo);
  PONT apagar = l->topo;
  l->topo = l->topo->prox;
  free(apagar);
  return true;
} /* excluirElemPilha */

/* Exclui (e libera a memoria) de todos os elementos da pilha */
bool destruirPilha(PILHA *l){
  PONT apagar;
  PONT posicao = l->topo;
  while (posicao != NULL){
        apagar = posicao;
        posicao = posicao->prox;
        free(apagar);
  }
  l->topo = NULL;
  return true;
} /* excluirElemPilha */


/* Inser��o em pilha (sempre no topo)
   Notem que o m�todo � bool mas sempre retornar� true */
bool inserirElemPilha(REGISTRO reg, PILHA *l) {
  PONT novo = (PONT) malloc(sizeof(REGISTRO));
  *novo = reg;
  novo->prox = l->topo;
  l->topo = novo;
  return true;
} /* inserirElemPilha */

/* retornarTopo - retorna o endereco do elemento do topo da pilha e (caso
   a pilha nao esteja vazia) retorna a chave desse elemento na memoria 
   apontada pelo ponteiro ch */
PONT retornarTopo(PILHA *l, TIPOCHAVE *ch){
  if (l->topo != NULL) *ch = l->topo->chave;
  return l->topo;
} /* retornarTopo */

