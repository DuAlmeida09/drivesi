package ep2.icc1;

public class Veiculo
{
	//atributos
	private String nomeDoProprietario;
	private int placa;
	private String cidade;
	private String estado;
	
	//armazena os dados do ve�culo
	public void armazenaVeiculo(String nomeDoProprietario, int placa, String cidade, String estado)
	{
		this.nomeDoProprietario = nomeDoProprietario;
		this.placa = placa;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	//a partir da placa de um ve�culo, devolve os dados armazenados
	public void devolveDados(int placa)
	{
		if (this.placa == placa)
		{
			System.out.println("Propriet�rio: " + this.nomeDoProprietario);
			System.out.println("Placa: " + this.placa);
			System.out.println("Cidade: " + this.cidade);
			System.out.println("Estado: " + this.estado + "\n");
		}
		else
		{
			System.out.println("Ve�culo n�o cadastrado!\n");
		}
	}
}
