/****************************************************/
/* nome: F�bio Nakano              no. USP  1048221 */
/* disciplina: ACH-2001 (ICC1)     data  01.04.2011 */
/* Lista 0, exercicio 3                             */
/* Verifica se um triangulo com v�rtices nos pontos */
/* {A,B,C} eh retangulo, calculando as distancias   */
/* entre os pontos e aplicando Pit�goras. Caso o    */
/* quadrado da hipotenusa seja igual (dentro de uma */
/* faixa de toler�ncia +-EPSILON) � soma dos        */
/* quadrados dos dois catetos, ent�o o triangulo    */
/* � ret�ngulo.                                     */
/* Sup�e que os pontos s�o distintos.               */
/****************************************************/

import java.lang.Math.*;

class Triangulo {

   public final static double EPSILON=1E-10;      // erro admiss�vel

   double xa=3, ya=7;                             // coordenadas de A
   double xb=10, yb=-5;                           // coordenadas de B
   double xc=9, yc=70;                            // coordenadas de C
   int Cor;                                       // cor do triangulo

   /** Testa se o triangulo eh retangulo. 
    *  Se sim, retorna true, sen�o retorna false.
    */
   boolean ehRetangulo () {
       double dab, dac, dbc;                      // distancias

       /* calculo das distancias */
       dab=calculaDistancia(xa, ya, xb, yb);
       dac=calculaDistancia(xa, ya, xc, yc);
       dbc=calculaDistancia(xb, yb, xc, yc);

       /* testa qual � a hipotenusa e aplica Pit�goras */
       if (dab>dac) {
           if (dab>dbc) {  // AB eh o maior segmento
               if (Math.abs(dab*dab-(dbc*dbc+dac*dac))<EPSILON) {
                   return true;
               }
           }
           else {          // BC eh o maior segmento
               if (Math.abs(dbc*dbc-(dab*dab+dac*dac))<EPSILON) {
                   return true;
               }
           }   
       }
       else {
           if (dac>dbc) {  // AC eh o maior segmento
               if (Math.abs(dac*dac-(dbc*dbc+dab*dab))<EPSILON) {
                   return true;
               }
           }
           else {          // BC eh o maior segmento
               if (Math.abs(dbc*dbc-(dab*dab+dac-dac))<EPSILON) {
                   return true;
               }
           }
       }
       return false;
   }

   /** Calcula a dist�ncia entre dois pontos. 
    *  Recebe as coodenadas de dois pontos: A=(xa, ya), B=(xb, yb)
    *  Retorna a dist�ncia dAB= ((xb-xa)^2+(yb-ya)^2)^(1/2).
    */
   double calculaDistancia (double xa, double ya, double xb, double yb) {
       return Math.sqrt ((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));
   }


   public static void main (String args[]) {
       Triangulo T1, T2;           // Declara

       T1= new Triangulo();    // Instancia

       /* Atribui as coordenadas dos v�rtices */
       T1.xa=0; T1.ya=0;
       T1.xb=0; T1.yb=4;
       T1.xc=3; T1.yc=5;


       System.out.println (T1.ehRetangulo());  /* Testa se T1 eh triangulo ret�ngulo */

       T2 = new Triangulo();

       System.out.println (T2.ehRetangulo());  /* Testa se T2 eh triangulo ret�ngulo */

   }
}
