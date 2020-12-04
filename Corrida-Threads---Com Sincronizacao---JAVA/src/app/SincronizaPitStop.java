package app;

public class SincronizaPitStop {

	public synchronized boolean pitstopUnico(String Carro) throws InterruptedException {
		System.out.println("PITSTOP CARRO: "+Carro);
		Thread.sleep((long) (200*Math.random()));
		return true;
	}
	
}
