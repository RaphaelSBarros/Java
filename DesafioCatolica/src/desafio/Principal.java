package desafio;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		//instancias
		Professor prof1 = new Professor();
		Funcionario func1 = new Funcionario();
		Aluno aluno1 = new Aluno();
		
		
		 				//Questão 2
		System.out.println("---Cadastro do Professor---");
		
		System.out.println("Digite seu nome: ");
		prof1.setNome(new Scanner(System.in).nextLine());
		
		System.out.println("Digite sua idade: ");
		prof1.setIdade(new Scanner(System.in).nextInt());
		
		System.out.println("Digite seu sexo: ");
		prof1.setSexo(new Scanner(System.in).nextLine());
		
		System.out.println("Digite seu salário: ");
		prof1.setSalario(new Scanner(System.in).nextFloat());
		
		System.out.println("Digite a disciplina exercida: ");
		prof1.setDisciplina(new Scanner(System.in).nextLine());
		
		System.out.println("Dar aumento para o professor "+prof1.getNome()+" ? 1 - Sim    2 - Não");
		int resp = new Scanner(System.in).nextInt();
		if(resp == 1) {
			prof1.receberAum();
		}
		
		System.out.println("\n---Dados do funcionario---");
	
		prof1.status();
		/*
					//Questão 3
					 
		System.out.println("Digite seu Nome: ");
		func1.setNome(new Scanner(System.in).nextLine());
		
		System.out.println("Digite sua idade: ");
		func1.setIdade(new Scanner(System.in).nextInt());
		
		System.out.println("Digite sua sexo: ");
		func1.setSexo(new Scanner(System.in).nextLine());
	
		System.out.println("Digite seu setor: ");
		func1.setSetor(new Scanner(System.in).nextLine());
	
		System.out.println("Voce esta trabalhando no momento? 'true/false': ");
		func1.setTrabalhando(new Scanner(System.in).nextBoolean());
		
		System.out.println("Voce deseja mudar de trabalho? 1 - Sim // 2- Não ");
		int resposta = new Scanner(System.in).nextInt();
		if(resposta == 1) {
			func1.mudarTrabalho();
			System.out.println("Seu Status de trabalho foi alterado!");
		}
	
		System.out.println("\n---Dados do Funcionario---");
		
		func1.status();
						// Questão 4
						
		System.out.println("Digite seu Nome: ");
		aluno1.setNome(new Scanner(System.in).nextLine());
		
		System.out.println("Digite sua idade: ");
		aluno1.setIdade(new Scanner(System.in).nextInt());
		
		System.out.println("Digite sua sexo: ");
		aluno1.setSexo(new Scanner(System.in).nextLine());
		
		System.out.println("Digite seu curso: ");
		aluno1.setCurso(new Scanner(System.in).nextLine());
		
		System.out.println("Está fazendo aniversario? 1- Sim // 2 - não");
		int resposta = new Scanner(System.in).nextInt();
		if(resposta == 1) {
			aluno1.fazerAniv();
			System.out.println("Sua idade agora é"+ aluno1.getIdade());
		}
		
		System.out.println("\n---Dados do Aluno---");
		aluno1.status();
	
		 							//Questão 5
		 							 
		System.out.println("--Cadastro--\n 1 - Aluno  2 - Funcionario  3 - Professor");
		int escolha = new Scanner(System.in).nextInt();
		if (escolha == 1) {
			System.out.println("----Cadastro de Aluno----");
			System.out.println("Digite seu Nome: ");
			aluno1.setNome(new Scanner(System.in).nextLine());
			
			System.out.println("Digite sua idade: ");
			aluno1.setIdade(new Scanner(System.in).nextInt());
			
			System.out.println("Digite sua sexo: ");
			aluno1.setSexo(new Scanner(System.in).nextLine());
			
			System.out.println("Digite seu curso: ");
			aluno1.setCurso(new Scanner(System.in).nextLine());
			
			System.out.println("Digite sua matricula: ");
			aluno1.setMatricula(new Scanner(System.in).nextInt());
			
			System.out.println("Cadastrado com sucesso!!");
			
		} else if(escolha == 2) {
			System.out.println("----Cadastro de Funcionario----");
			System.out.println("Digite seu Nome: ");
			func1.setNome(new Scanner(System.in).nextLine());
			
			System.out.println("Digite sua idade: ");
			func1.setIdade(new Scanner(System.in).nextInt());
			
			System.out.println("Digite sua sexo: ");
			func1.setSexo(new Scanner(System.in).nextLine());
		
			System.out.println("Digite seu setor: ");
			func1.setSetor(new Scanner(System.in).nextLine());
			
			System.out.println("Cadastrado com sucesso!!");
			
		} else if(escolha == 3) {
			System.out.println("----Cadastro de Professor----");
			System.out.println("Digite seu nome: ");
			prof1.setNome(new Scanner(System.in).nextLine());
			
			System.out.println("Digite sua idade: ");
			prof1.setIdade(new Scanner(System.in).nextInt());
			
			System.out.println("Digite seu sexo: ");
			prof1.setSexo(new Scanner(System.in).nextLine());
			
			System.out.println("Digite seu salário: ");
			prof1.setSalario(new Scanner(System.in).nextFloat());
			
			System.out.println("Cadastrado com sucesso!!");
			
		}else {
			System.out.println("Opção Inválida!");
		}
	*/
	}

}
