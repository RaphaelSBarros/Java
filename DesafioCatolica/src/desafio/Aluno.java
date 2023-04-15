package desafio;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void cancelarMatr() {
		
	}
	
	public void status() {
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Sexo: "+this.getSexo());
		System.out.println("Curso: "+this.getCurso());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
