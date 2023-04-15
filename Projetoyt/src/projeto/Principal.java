package projeto;

public class Principal {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video ("Aula 10 de HTML5");
		
		Usuario u[] = new Usuario[2];
		u[0] = new Usuario("Jubileu", 22, "M", "Juba");
		u[1] = new Usuario("Creuza", 12, "F", "Creuzita");
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(u[0], v[2]); // Jubileu assiste HTML5
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(u[0], v[1]); // Jubileu assiste PHP
		vis[1].avaliar(98.0f);
		System.out.println(vis[1].toString());
		
		/*
		System.out.println("              Vídeos\n-------------------------------------");
		System.out.println(v[0].toString());
		System.out.println("\n"+v[1].toString());
		System.out.println("\n"+v[2].toString());
		
		System.out.println("\n            Usuários\n-------------------------------------");
		System.out.println(u[0].toString());
		System.out.println("\n"+u[1].toString());*/
	}
}
