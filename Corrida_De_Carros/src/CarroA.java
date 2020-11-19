
public class CarroA extends Thread{
	@Override
	public void run() {
		for(int x = 0; x < 15; x++) {
			System.out.println(" x-x   \n |A|   \n x-x  \n \\ /");
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
