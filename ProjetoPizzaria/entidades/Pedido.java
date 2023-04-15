package entidades;

public class Pedido {
	private int qtdPizzas;
	private Cliente cli;
	private Pizzas pizza;

	public Pedido(int qtd, Cliente nome, Pizzas pizza1) {
		this.qtdPizzas = qtd;
		this.cli = nome;
		this.pizza = pizza1;
		
	}


}
