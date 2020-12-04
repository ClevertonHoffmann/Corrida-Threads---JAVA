package app;

public class Carro{
	static SincronizaPitStop p = new SincronizaPitStop();
	boolean b = false;
	public synchronized void imprimeCarro(int pitstop, String nome, String carro){
		for(int x = 0; x < 15; x++) {
			System.out.println(carro);
			if(x == pitstop) {
				try {
					b = p.pitstopUnico(nome);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			Thread.sleep((long) (2000*Math.random()));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
