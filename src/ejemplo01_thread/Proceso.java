package ejemplo01_thread;

public class Proceso extends Thread{
	
	public Proceso(String nameProcess) {
		super(nameProcess);
	}

	public void listValues() {
		for(int i=0;i<5;++i) {
			System.out.println(getName()+": "+i);
		}
	}
	public void run() {
		listValues();
	}
	
}
