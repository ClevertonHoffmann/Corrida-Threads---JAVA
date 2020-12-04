package app;

import java.util.ArrayList;

/*  
 * Classe Main responsável por chamar o método para rodar as threads.
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Largada Corrida ");
		System.out.println(" cA    cB    cC    cD    cE ");
		Thread.sleep(1000);
		//Momento de Pitstop /Nome/ Desenho do Carro
		IniciaCorrida c1 = new IniciaCorrida(2, "A", " x-x   \n |A|   \n x-x  \n \\ /");
		IniciaCorrida c2 = new IniciaCorrida(4, "B", "       x-x   \n       |B|   \n       x-x  \n       \\ /");
		IniciaCorrida c3 = new IniciaCorrida(8, "C", "             x-x   \n             |C|   \n             x-x  \n             \\ /");
		IniciaCorrida c4 = new IniciaCorrida(7, "D", "                   x-x   \n                   |D|   \n                   x-x  \n                   \\ /");
		IniciaCorrida c5 = new IniciaCorrida(3, "E", "                         x-x   \n                         |E|   \n                         x-x  \n                         \\ /");	
		Thread t1 = c1.start();
		Thread t2 = c2.start();
		Thread t3 = c3.start();
		Thread t4 = c4.start();
		Thread t5 = c5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		IniciaCorrida[] t = new IniciaCorrida[5];
		t[0] = c1;
		t[1] = c2;
		t[2] = c3;
		t[3] = c4;
		t[4] = c5;
		IniciaCorrida aux;
		System.out.println("Ranking de Chegada:");
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				if(t[x].tempo<t[y].tempo) {
					aux = t[y];
					t[y] = t[x];
					t[x] = aux;
				}
			}
		}
		for(int x = 0; x < 5; x++) {
			System.out.println("Carro: "+t[x].nome +" com o tempo de "+t[x].tempo);
		}
	}
}
