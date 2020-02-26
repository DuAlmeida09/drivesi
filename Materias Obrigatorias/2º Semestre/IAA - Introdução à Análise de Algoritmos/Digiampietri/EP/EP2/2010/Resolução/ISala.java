package ep2;

/**
	Define a sala onde o rob� ser� executado
*/
public interface ISala {
	////// CONSTANTES DE MAPEAMENTO DA SALA //////
	/** Tamanho da sala */
	public static final int TAMANHO_SALA = 10;
	/** Coordenada x do in�cio da �rea de armazenagem (canto superior esquerdo) */
	public static final int X_INICIO_ARM = 0;
	/** Coordenada y do in�cio da �rea de armazenagem (canto superior esquerdo) */
	public static final int Y_INICIO_ARM = 0;
	/** Coordenada x do fim da �rea de armazenagem (canto inferior direito) */
	public static final int X_FIM_ARM = 1;
	/** Coordenada y do fim da �rea de armazenagem (canto inferior direito) */
	public static final int Y_FIM_ARM = 1;
	
	
	////// CONSTANTES DE MARCA��O DA SALA //////
	/** Define a marca de um bloco na sala */
	public static final int BLOCO_PRESENTE = 3;
	/** Define a marca de um obst�culo sala */
	public static final int OBSTACULO_PRESENTE = 2;
	/** Define a marca deixada pelo rob� na sala */
	public static final int MARCA_PRESENTE = 1;
	/** Define a marca indicando que a posi��o est� vazia */
	public static final int POSICAO_VAZIA = 0;
	
	
	/**
		Verifica se a posi��o de busca � v�lida. S�o consideradas inv�lidas apenas coordenadas que remetam a fora da �rea de busca.
		
		@param x Coordenada x da posi��o
		@param y Coordenada y da posi��o
		
		@return true se a posi��o for v�lida para busca, false se n�o.
	*/
	public boolean posicaoBuscaValida(int x, int y);
	
	/**
		Verifica se uma determinada posi��o da sala est� marcada
		
		@param x Coordenada x da posi��o
		@param y Coordenada y da posi��o
		
		@return O marcador existente na posi��o
	*/
	public int marcadorEm(int x, int y);
	
	/**
		Marca uma determinada posi��o de busca com o marcador fornecido. Sobrescreve qualquer marcador que l� houvesse.
		
		@param x Coordenada x da posi��o
		@param y Coordenada y da posi��o
		@param marcador Marcador a ser inserido na posi��o
		
		@return false se as coordenadas n�o forem v�lidas para busca, true caso sejam
	*/
	public boolean marcaPosicaoBusca(int x, int y, int marcador);
	
	/**
		Marca uma determinada posi��o de armazenagem com um bloco.
		
		@param x Coordenada x da posi��o
		@param y Coordenada y da posi��o
		
		@return false se as coordenadas n�o forem v�lidas para armazenagem, ou ent�o se a coordenada j� estiver marcada, true caso consiga inserir o marcador BLOCO_PRESENTE na posi��o.
	*/
	public boolean marcaPosicaoArmazenagem(int x, int y);
	
	/**
		Remove o marcador de uma determinada posi��o da �rea de busca (exceto OBSTACULO_PRESENTE, que deixa intacto). Se a posi��o for inv�lida, nada faz.
		
		@param x Coordenada x da posi��o
		@param y Coordenada y da posi��o
	*/
	public void removeMarcador(int x, int y);
	
	/**
		@param x Coordenada x da posi��o verificada
		@param y Coordenada y da posi��o verificada
		
		@return true se as coordenadas estiverem dentro da �rea de armazenagem, false se n�o
	*/
	public boolean areaArmazenagem(int x, int y);
	
	/**
		Remove um determinado marcador de toda a �rea de busca da sala.
		
		@param marcador O marcador a ser removido
	*/
	public void removeMarcador(int marcador);
}
