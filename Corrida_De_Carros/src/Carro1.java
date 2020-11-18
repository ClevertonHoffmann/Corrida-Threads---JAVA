
public class Carro1 extends Thread{
	@Override
	public void run() {
		for(int x = 0; x < 10; x++) {
			System.out.println("\n      x-x   \n      |1|   \n      x-x  \n      \\ /");
			Thread.currentThread();
			Thread.yield();
			try {
				Thread.sleep((long) (2000*Math.random()));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
