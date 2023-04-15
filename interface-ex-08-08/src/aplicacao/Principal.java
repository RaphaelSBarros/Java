package aplicacao;

import java.util.Scanner;
import entidade.Gato;
import entidade.Passarinho;
import entidade.Cachorro;
import entidade.Cavalo;

public class Principal {

	public static void main(String[] args) {
		
		Scanner recebe= new Scanner(System.in);
		
		//estanciando
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Passarinho passarinho = new Passarinho();
		
		//entrada de dados
		//---------------cachorro----------------------------
		System.out.println("Digite o nome do  animal1: ");
		cachorro.setNome(new Scanner(System.in).nextLine());
		
		System.out.println("Digite a raça do animal1: ");
		cachorro.setRaca(new Scanner(System.in).nextLine());
		
		System.out.println("Digite o tamanho do animal1: ");
		cachorro.setTamanho(new Scanner(System.in).nextLine());
		
		//---------------gato----------------------------------
		
		System.out.println("Digite o nome do  animal2: ");
		gato.setNome(new Scanner(System.in).nextLine());
		
		System.out.println("Digite a raça do animal2: ");
		gato.setRaca(new Scanner(System.in).nextLine());
		
		
		//----------------cavalo-------------------
		System.out.println("Digite o nome do  animal3: ");
		cavalo.setNome(new Scanner(System.in).nextLine());
	
		
		//----------------passarinho-------------------
		System.out.println("Digite o nome do  animal4: ");
        passarinho.setNome(new Scanner(System.in).nextLine());
		
		
		//saida de dados ------> dados cachorro
		System.out.println("Animal1: " + cachorro.getNome());
		System.out.println("raca: " + cachorro.getRaca());
		System.out.println("tamanho: " + cachorro.getTamanho());
		
		System.out.println("som que o cachorro emite: ");
		cachorro.emitirSom();
		
		System.out.println("comportamentos do cachorro: ");
		cachorro.brincarSofar();
		cachorro.alimentar();
		
		System.out.println("o" + cachorro.getNome() + "precisa que o dono: ");
		cachorro.chamarVeterinario();
		cachorro.levarVeterinario();
		
		//saida de dados --- dados gato
		System.out.println("Animal2: " + gato.getNome());
		
		//saida de dados --- dados Cavalo
		System.out.println("Animal3: " + cavalo.getNome());
		
		//saida de dados --- dados Passarinho
		System.out.println("Animal4: " + passarinho.getNome());
	}}