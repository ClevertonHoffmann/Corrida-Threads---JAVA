import java.util.ArrayList;
import java.util.Collections;

/*  
 * Classe Main responsável por dar o start nos carros.
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Largada Corrida ");
		System.out.println(" cA    cB    cC    cD    cE ");
		Thread.sleep(1000);
		CarroA t1 = new CarroA();
		CarroB t2 = new CarroB();
		CarroC t3 = new CarroC();
		CarroD t4 = new CarroD();
		CarroE t5 = new CarroE();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fim de Corrida");		
		System.out.println("Valores de Chegada por tempo:");
		System.out.println("Carro A : "+t1.a);	
		System.out.println("Carro B : "+t2.b);	
		System.out.println("Carro C : "+t3.c);	
		System.out.println("Carro D : "+t4.d);	
		System.out.println("Carro E : "+t5.e);	
		
	}

}
