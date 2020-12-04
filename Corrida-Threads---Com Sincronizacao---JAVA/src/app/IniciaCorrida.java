package app;

public class IniciaCorrida implements Runnable{
	public String nome;
	private String carro;
	private int pitstop;
	public long tempo;
	private static Carro c = new Carro();

	public IniciaCorrida(int pitstop, String nome, String carro) {
		this.nome = nome;
		this.carro = carro;
		this.pitstop = pitstop;
	}

	@Override
	public void run() {
		this.tempo = System.currentTimeMillis() + this.tempo;
		this.c.imprimeCarro(pitstop, nome, carro);
		this.tempo = System.currentTimeMillis()-this.tempo;
	}
	
	public Thread start() {
		Thread t = new Thread(this);
		t.start();
		return t;
	}
	
}
