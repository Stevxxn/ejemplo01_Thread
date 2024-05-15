package ejemplo01_thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proceso pc1=new Proceso("Proceso 1");
		Proceso pc2=new Proceso("Proceso 2");
		Proceso pc3=new Proceso("Proceso 3");
	
		pc1.start();
		pc2.start();
		pc3.start();
		
	}
}
