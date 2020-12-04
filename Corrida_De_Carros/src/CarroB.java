public class CarroB extends Thread{
	public long b;
	private int p = 10;
	private boolean pt = false;
	public static SincronizaPitStop s = new SincronizaPitStop();
	@Override
	public void run() {
		for(int x = 0; x < 15; x++) {
			System.out.println("\n      x-x   \n      |B|   \n      x-x  \n      \\ /");
			try {
				if(x == p &&!pt)
				s.pitstop("Carro B");
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
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
