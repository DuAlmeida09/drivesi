enum Cor {MARROM, VERMELHO, VERDE};

class Triangulo {
  private Cor C;
  public void setCor (Cor NovaCor) {
        C=NovaCor;
    }
    Cor getCor () {
        return C;
    }
}

class Testa3 {
    public static void main (String args[]) {

       Triangulo T1, T2, T3;
       T1 = new Triangulo();
       T2 = new Triangulo();
       T3 = new Triangulo();
       T1.setCor(Cor.VERMELHO);
       T2.setCor(Cor.VERDE);
       T3.C=Cor.MARROM;  // N�o funciona pois o atributo � private
       System.out.println (T1.getCor());
       System.out.println (T2.getCor());
       System.out.println (T3.getCor());
    }
}

/* O que foi resolvido:
 * 3-) Atributos da classe s�o diretamente modific�veis,
       o que exp�e a implementa��o. */
/* problema criado:
 * nenhum */
/* aviso:
 * tres classes em um mesmo arquivo */
