package ep2;

/**
	Interface para defini��o das a��es poss�veis ao nosso Rob�
*/
public interface IRobo {
	/** Define o n�mero de blocos do sistema */
	public static final int N_BLOCOS = 4;
	
	/**
		Busca um bloco na �rea de busca da sala, usando busca em profundidade, a partir das coordenadas (x,y). A cada passo dado, o programa envia mensagem ao usu�rio avisando (via Mensageiro)
		
		@param x Coordenada x da �rea de busca
		@param y Coordenada y da �rea de busca
		
		@return True, caso encontre um bloco nessa busca. False se correr toda a �rea poss�vel e n�o encontrar.
	*/
	public boolean buscaBloco(int x, int y);
	
	/**
		Procura uma posi��o vazia dentro da �rea de armazenagem, armazenando l� um bloco. O armazenamento do bloco � feito colocando-se um ISala.BLOCO_PRESENTE nessa posi��o. Despreze os movimentos do rob� dentro da �rea de armazenagem.
		
		Ap�s fazer a marca��o, o programa envia mensagem ao usu�rio avisando (via Mensageiro)
		
		@return true se efetivamente armazenou algo, false se n�o pode armazenar (pela �rea estar cheia, por exemplo).
	*/
	public boolean guardaBloco();
	
	/**
		Adiciona um obst�culo � �rea de busca do rob�. Se a coordenada passada n�o estiver na �rea de busca, n�o faz nada.
		
		@param x Coordenada x da �rea de busca
		@param y Coordenada y da �rea de busca
	*/
	public void adicionaObstaculo(int x, int y);
	
	/**
		Adiciona um bloco � �rea de busca do rob�. Se a coordenada passada n�o estiver na �rea de busca, n�o faz nada.
		
		@param x Coordenada x da �rea de busca
		@param y Coordenada y da �rea de busca
	*/
	public void adicionaBloco(int x, int y);
	
	/**
		Prepara a sala para uma nova busca, removendo marcas MARCA_PRESENTE
	*/
	public void novaBusca();
	
	/**
		Executa a busca por todos os blocos espalhados pela sala.
	*/
	public void buscaBlocos();
}
