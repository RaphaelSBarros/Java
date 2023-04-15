package entidade;

import interface3.AnimalDomesticado;
import interface3.AnimalEstimacao;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	
	//atributos
	private  String raca;
	
	
	//metodos
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public void amamentar() {
		
	}
	@Override
	public void emitirSom() {
		
	}
	
	
	
	//metodos interface
	@Override
	public void brincarSofar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void chamarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	
	
}
