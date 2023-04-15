package entity;

public class Pilha {
	private Object arranjo[];
	private int topo;
	
	static private final int DEFAULT = 10;
	
	public Pilha() {
		arranjo = new Object[DEFAULT];
		topo = -1;
	}
	
	public void esvazie() {
		topo = -1;
	}
	
	public int tamanho() {
		return(topo + 1);
	}
	
	public void push(Object x) {
		topo++;
		if(topo == arranjo.length) {
			dupliqueArranjo();
		}
		arranjo[topo] = x;
	}
	
	private void dupliqueArranjo() {
		Object novoArranjo[] = Object[2 * arranjo.length];
		for(int i = 0; i < arranjo.length; i++) {
			novoArranjo[i] = arranjo[i];
		}
		arranjo = novoArranjo;
	}
	
	public Object top() {
		if(topo >= 0) {
			return(arranjo[topo]);
		}else {
			return (null);
		}
	}
	
	public Object pop() {
		if(topo >= 0) {
			return(arranjo[topo--]);
		}else {
			return (null);
		}
	}
}
