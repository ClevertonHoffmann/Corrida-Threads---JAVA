public class CarroA extends Thread{
	public long a;
	private int p = 3;
	private boolean pt = false;
	public static SincronizaPitStop s = new SincronizaPitStop();
	@Override
	public void run() {
		for(int x = 0; x < 15; x++) {
			System.out.println(" x-x   \n |A|   \n x-x  \n \\ /");
			if(x == p &&!pt)
			try {
				pt = s.pitstop("Carro A");
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			
			}
			Thread.currentThread();
			Thread.yield();
			try {
				Thread.sleep((long) (2000*Math.random()));
				a = System.currentTimeMillis();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
