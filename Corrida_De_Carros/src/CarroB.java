
public class CarroB extends Thread{
	public long b;
	@Override
	public void run() {
		for(int x = 0; x < 15; x++) {
			System.out.println("\n      x-x   \n      |B|   \n      x-x  \n      \\ /");
			Thread.currentThread();
			Thread.yield();
			try {
				Thread.sleep((long) (2000*Math.random()));
				b = System.currentTimeMillis();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
