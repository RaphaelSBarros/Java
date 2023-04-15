package entidade;

import interface3.AnimalDomesticado;
import interface3.AnimalEstimacao;

public class Cachorro extends Mamifero  implements AnimalDomesticado, AnimalEstimacao{

	//atributos
	private String tamanho;
	private String raca;
	

//metodos 
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	

	@Override
	public void alimentar() {
		System.out.println("alimentando....");
		
	}
	
	public void emitirSom() {
		System.out.println("latido cachorro ...");
	}
	
	//metodos de interface
	@Override
	public void levarVeterinario() {
		System.out.println("levar ao veterinario");
		
	}
	@Override
	public void chamarVeterinario() {
		System.out.println("chamar veterinario");
		
	}
	@Override
	public void brincarSofar() {
		System.out.println("brincando... no sofar");
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

}
