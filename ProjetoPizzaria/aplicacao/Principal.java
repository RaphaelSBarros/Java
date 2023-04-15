package aplicacao;

import java.util.Scanner;
import entidades.Cliente;
import entidades.Pedido;
import entidades.Pizzas;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Pizzas[] pizza1 = new Pizzas[50];
		
		
		System.out.println("Favor informar a quantidade de pizzas do cardapio");
		int x = ler.nextInt();
		int posicao = 1;
		int i;
		for(i=0; i<x;i++) {
			System.out.println("Informe o sabor da pizza "+posicao);
			posicao++;
			String sabor = new Scanner(System.in).nextLine();
			System.out.println("Quantas fatias a pizza " + sabor + " tem");
			int fatias = ler.nextInt();
			System.out.println("Informe o valor da pizza " + sabor);
			double valor = ler.nextDouble();
			pizza1[i] = new Pizzas(sabor, fatias, valor);
		
		}
		
		System.out.println("Favor informar o seu nome");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("Favor informar o seu telefone");
		int fone = ler.nextInt();
		System.out.println("Favor informar o numero do seu cartao");
		int cartao = ler.nextInt();
		System.out.println("Favor informar o endereco da entrega");
		String endereco = new Scanner(System.in).nextLine();
		Cliente cliente1 = new Cliente(nome, fone, cartao, endereco);
		
		
		System.out.println("");
		
		System.out.println("Voce deseja encomendar uma pizza");
		System.out.println("informe 1 para encomendar e 2 para sair");
		int op=ler.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("Escolha a pizza do Cardapio");
			posicao = 1;
			for(i=0;i<x;i++) {
				System.out.println(posicao+" - "+ pizza1[i].getDescricaoPizza());
				posicao++;
			}
			int escolha=ler.nextInt();
			escolha=escolha-1;
			System.out.println("Quantas pizzas voce deseja");
			int qtdpizzas = ler.nextInt();
			
			Pedido pedido = new Pedido(qtdpizzas, cliente1, pizza1[escolha]);
			
			System.out.println( cliente1.getNome() + " voce escolheu a pizza " + pizza1[escolha].getDescricaoPizza());
			System.out.print(" E voce devera pagar o valor de R$");
			System.out.printf("%.2f ", pizza1[escolha].getValor()*qtdpizzas);
			System.out.println();
			
			break;
			case 2:
				System.out.println("Obrigada pela sua visita. Volte sempre!!");
				break;
			default:
				System.out.println("Opcao invalida");
				break;
		}
		
		
			

	}

}
