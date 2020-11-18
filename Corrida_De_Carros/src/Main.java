/*  
 * Classe Main responsável por dar o start nos carros.
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Largada Corrida ");
		System.out.println(" C2    C1 ");
		Thread.sleep(1000);
		Carro1 t1 = new Carro1();
		Carro2 t2 = new Carro2();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fim de Corrida");
	}

}
