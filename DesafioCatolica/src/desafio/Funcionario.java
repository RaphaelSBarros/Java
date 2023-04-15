package desafio;

public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando =! trabalhando;
	}
	
	public void status() {
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Sexo: "+this.getSexo());
		System.out.println("Setor: "+this.getSetor());
		System.out.println("Trabalhando: "+this.isTrabalhando());
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
}
