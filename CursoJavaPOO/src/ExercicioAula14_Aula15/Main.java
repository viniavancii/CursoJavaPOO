package ExercicioAula14_Aula15;

public class Main {

	public static void main(String[] args) {
		//Gafanhoto p1 = new Gafanhoto();
		//System.out.println(p1.toString());
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 POO");
		v[1] = new Video("Aula 2 POO");
		v[2] = new Video("Aula 3 POO");
		v[0].like();
		v[0].play();
		System.out.println(v[0].toString());
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("João", 22, "Masculino", "Joao"); 
		g[1] = new Gafanhoto("Creuza", 21, "Feminino", "Creu"); 
		System.out.println(g[0].toString());
		
		Visualizacao vis = new Visualizacao(g[0], v[0]);
		vis.avaliar(7);
		System.out.println(vis.toString());
	}

}
