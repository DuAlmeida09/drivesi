#include <stdio.h>
#include <malloc.h>

typedef struct {
  int peso; // peso em quilogramas
  int altura; // altura em centimetros
} pesoAltura;

typedef pesoAltura* PONT;

int main() {
  PONT p = (PONT) malloc(sizeof(pesoAltura));
  p->peso = 80;
  p->altura = 185;
  
  printf("Peso: %d, Altura %d.\n", p->peso, p->altura);

  // Uma outra maneira de popular o conteudo de memoria apontado por p eh copiando uma estrutura peso altura para lah:
  pesoAltura p2;
  p2.peso = 70;
  p2.altura = 170;
  *p = p2;
  printf("Peso: %d, Altura %d.\n", p->peso, p->altura);


  // O comando free libera a memoria apontada por p
  free(p);

  // A pr�xima linha tenta acessar o espa�o em mem�ria j� liberado.
  // C permite que isso seja feito, mas n�o garante o conte�do da mem�ria.
  // Isso nunca deve ser feito num programa real (acessar mem�ria j� liberada).
  printf("Peso: %d, Altura %d.\n ", p->peso, p->altura);

  system("pause");

  return 0;
}

/*
Peso: 80, Altura 185.
Peso: 70, Altura 170.
Peso: 8917088, Altura 8913092.
*/
