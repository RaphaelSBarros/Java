package entidade;

public abstract class Animal {
	
//atributos
protected  String nome;



//metodos
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public abstract void emitirSom();
	
}
