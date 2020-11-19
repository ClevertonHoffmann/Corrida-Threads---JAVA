/*  
 * Classe Main responsável por dar o start nos carros.
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Largada Corrida ");
		System.out.println(" cA    cB ");
		Thread.sleep(1000);
		String a = "";
		CarroA t1 = new CarroA();
		CarroB t2 = new CarroB();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fim de Corrida");
		
		if(t1.a>t2.b) {
			System.out.println("Carro B ganhou a corrida!");
		} else {
			System.out.println("Carro A ganhou a corrida!");
		}
	}

}
