
public class SincronizaPitStop {

	public synchronized boolean pitstop(String carro) throws InterruptedException {
		System.out.println("Pitstop carro: " + carro);
		Thread.sleep((long) (2000*Math.random()));
		return true;
	}	
}
