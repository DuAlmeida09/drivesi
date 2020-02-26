package demo;

class ErroEntrada extends Exception {
	
	public ErroEntrada() {
		super("Excecao - Dados de Entrada Invalidos");
	}

}

class ValorZero extends Exception {
	
	public ValorZero() {
		super("Exce��o - Valor de entrada Zero");
	}

}

class NumeroNegativo extends Exception {
	
	public NumeroNegativo() {
		super("Exce��o - Numero Negativo");
	}

}

