package entidades;

public class Pizzas {
	private String descricaoPizza;
	private int qtdFatias;
	private double valor;

	public Pizzas(String desc, int qtd, double valor) {
		this.descricaoPizza = desc;
		this.qtdFatias = qtd;
		this.valor = valor;
		
	}

	public String getDescricaoPizza() {
		return descricaoPizza;
	}

	public void setDescricaoPizza(String descricaoPizza) {
		this.descricaoPizza = descricaoPizza;
	}

	public int getQtdFatias() {
		return qtdFatias;
	}

	public void setQtdFatias(int qtdFatias) {
		this.qtdFatias = qtdFatias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
