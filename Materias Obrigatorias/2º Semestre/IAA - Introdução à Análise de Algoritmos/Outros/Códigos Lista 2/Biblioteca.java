class Biblioteca
{
  private Livro[] arrayLivros;
  
  Biblioteca(int tamanhoArray)
  {
    criaArray(new Livro [tamanhoArray]);
    insereLivro();
  }
  
// m�todo para criar vetor de Livros
  public void criaArray(Livro[] qtdLivros)
  {
    arrayLivros = qtdLivros;
  }
  
// aqui vai o c�digo para criar o vetor de Livros (voc� n�o precisa completar)
  public void insereLivro()
  {
    arrayLivros[0] = new Livro();
    arrayLivros[0].setTitulo("Percy Jackson e o Ladr�o de Raio");
    arrayLivros[0].setAno(2011);
    arrayLivros[0].setTipo(1);
    //e por ai vai at�...
    arrayLivros[arrayLivros.length -1] = new Livro();
    arrayLivros[arrayLivros.length -1].setTitulo("Percy Jackson e o Ultimo dos Olimpianos");
    arrayLivros[arrayLivros.length -1].setAno(2010);
    arrayLivros[arrayLivros.length -1].setTipo(1);
  }
  
// aqui vai o c�digo para imprimir o vetor de Livros (voc� n�o precisa completar)
  void imprimeLivros()
  {
    for(int x = 0; x < arrayLivros.length; x++){
      arrayLivros[x].imprime();
    }
    System.out.println();
  }
  
// m�todo para ordenar o vetor
//... aqui vai c�digo para ordenar o vetor (voc� deve apresent�-lo completo-)
  void ordenaLivros(ComparadorDeLivro a)
  {
    int ivet, isubv, iMenor;
    int fim = arrayLivros.length;
    Livro temp;
    
    for (ivet=0; ivet < fim - 1; ivet++) // percorre vetor principal
    {
      // o primeiro elemento do vetor � o menor elemento inicialmente
      iMenor = ivet;
      
      // percorre subvetor
      for (isubv = ivet + 1; isubv < fim; isubv++)
      {
        if ((a.livroMenor(arrayLivros[isubv] , arrayLivros[iMenor])) == -1)
          iMenor = isubv;
      }
      
      // executa a troca do menor elemento atual com o menor elemento
      // encontrado no subvetor
      temp = arrayLivros[ivet];
      arrayLivros[ivet] = arrayLivros[iMenor];
      arrayLivros[iMenor] = temp;
    }
  }
  
// m�todo principal
  public static void main (String [] args)
  {
    Biblioteca bibl= new Biblioteca(2);
    System.out.println("Livros desordenados");
    bibl.imprimeLivros();
    System.out.println("Livros em ordem de t�tulo");
    //(voc� deve completar aqui)
    ComparadorDeLivro titulo = new ComparaTitulo();
    bibl.ordenaLivros(titulo);
    bibl.imprimeLivros();
    System.out.println("Livros em ordem de ano");
    //(voc� deve completar aqui)
    bibl.ordenaLivros(new ComparaAno());
    bibl.imprimeLivros();
  }
}