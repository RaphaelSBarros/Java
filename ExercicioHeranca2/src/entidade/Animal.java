package entidade;

public class Animal {
	String nome;
	float comprimento;
	int numPatas;
	String cor;
	String ambiente;
	float velMedia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelMedia() {
		return velMedia;
	}
	public void setVelMedia(float velMedia) {
		this.velMedia = velMedia;
	}
	
	public void dados() {
		System.out.println("---Informações do Anmal---");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Comprimento: "+this.getComprimento()+" m");
		System.out.println("Numero de patas: "+this.getNumPatas());
		System.out.println("Cor: "+this.getCor());
		System.out.println("Ambiente: "+this.getAmbiente());
		System.out.println("Velocidade media: "+this.getVelMedia()+" km/h");
		System.out.println("--------------------------");
	}
	
	public Animal() {
		this.setComprimento(1);
		this.setNumPatas(4);
		this.setVelMedia(30);
	}
	
}
