package application;

import java.util.StringTokenizer;

import entity.Pilha;

public class Avalia {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("*Insira_entrada!*");
			System.exit(-1);
		}
		String entrada = args[0];
		Pilha pilha = new Pilha();
		StringTokenizer st = new StringTokenizer(entrada);
		while(st.hasMoreElements()) {
			String nextToken = st.nextToken();
			if(nextToken.compareTo("+")==0) {
				opera(pilha, 1);
			}else if(nextToken.compareTo("--")==0) {
				opera(pilha, 2);
			}else if(nextToken.compareTo("*")==0) {
				opera(pilha, 3);
			}else if(nextToken.compareTo("/")==0) {
				opera(pilha, 4);
			}else if(nextToken.compareTo("^")==0) {
				opera(pilha, 5);
			}else {
				pilha.push(nextToken);
			}
			System.out.println("*Resultado = "+ pilha.pop());
		}
	}

	private static void opera(Pilha pilha, int tipo) {
		int int1 = Integer.parseInt((String)(pilha.pop()));
		int int2 = Integer.parseInt((String)(pilha.pop()));
		int resultado = 0;
		if(tipo == 1) {
			resultado = int2 + int1;
		}else if(tipo == 2) {
			resultado = int2 - int1;
		}else if(tipo == 3) {
			resultado = int2 * int1;
		}else if(tipo == 4) {
			resultado = int2 / int1;
		}else if(tipo == 5) {
			resultado = 1;
			for(int i=0; i<int1; i++);
		}
		pilha.push((new Integer(resultado)).toString());
	}
}
