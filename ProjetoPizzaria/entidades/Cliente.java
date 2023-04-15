package entidades;

public class Cliente {
	private String nome;
	private int telefone;
	private int cartao;
	private String endereco;

	public Cliente(String nome, int fone, int cartao, String end) {
		this.nome = nome;
		this.telefone = fone;
		this.cartao = cartao;
		this.endereco = end;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCartao() {
		return cartao;
	}

	public void setCartao(int cartao) {
		this.cartao = cartao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	

}
