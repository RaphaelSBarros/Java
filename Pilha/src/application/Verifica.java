package application;

import entity.Pilha;

public class Verifica {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("*Insira_entrada!*");
			System.exit(-1);
		}
		String entrada = args[0];
		Pilha pilha = new Pilha();
		for(int i=0; i < entrada.length(); i++) {
			char c = entrada.charAt(i);
			if(c=='(') {
				pilha.push(c);
			}
			if(c==')') {
				char o = pilha.pop();
			}
			if(o=='0') {
				System.out.println("Falta_abertura!");
				System.exit(-2);
			}
		}
	if(pilha.tamanho()>0) {
		System.out.println("*Falta_fechamento");
		System.exit(-3);
	}else {
		System.out.println("*Entrada_consistente");
	}
}
}
