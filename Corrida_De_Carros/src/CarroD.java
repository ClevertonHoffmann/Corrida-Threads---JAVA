
public class CarroD extends Thread{
	public long d;
	private int p = 8;
	private boolean pt = false;
	public static SincronizaPitStop s = new SincronizaPitStop();
	@Override
	public void run() {
		for(int x = 0; x < 15; x++) {
			System.out.println("\n                  x-x   \n                  |D|   \n                  x-x  \n                  \\ /");
			try {
				if(x == p &&!pt)
				s.pitstop("Carro D");
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			Thread.currentThread();
			Thread.yield();
			try {
				Thread.sleep((long) (2000*Math.random()));
				d = System.currentTimeMillis();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
