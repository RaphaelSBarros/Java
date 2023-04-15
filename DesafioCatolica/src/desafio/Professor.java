package desafio;

public class Professor extends Pessoa {
	private String disciplina;
	private float salario;
	
	public void receberAum() {
		this.setSalario(this.getSalario()+(this.getSalario()*0.3f));
	}
	
	public void status() {
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Sexo: "+this.getSexo());
		System.out.println("Salario: "+this.getSalario());
		System.out.println("Disciplina Exercida: "+this.getDisciplina());
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
