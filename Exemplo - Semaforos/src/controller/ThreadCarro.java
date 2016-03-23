package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread {
	private int idThread;
	private Semaphore semaforo;
	
	
	public ThreadCarro(int idThread, Semaphore semaforo) {
		this.idThread = idThread;
		this.semaforo = semaforo;
	}



	private void andando() 
	{
		int distanciaP = 0;
		int distanciaTot = (int)((Math.random()*1001)+1000);
		while (distanciaP<distanciaTot)
		{
			distanciaP = distanciaP+100;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("O carro #"+idThread+" já percorreu "+distanciaP+"m, de um total de "+distanciaTot+"m");
		}
		System.out.println("O carro #"+idThread+" chegou!");
	}
	private void  estacionado() 
	{
		System.out.println("O carro #"+idThread+" estacionou");
		int tempoEst = (int)((Math.random()*4001)+1000);
		try {
			Thread.sleep(tempoEst);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void  saindo() 
	{
		System.out.println("O carro #"+idThread+" saiu");
		
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		andando();
		try {
			semaforo.acquire();
			estacionado();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		semaforo.release();
		saindo();		
		}
		super.run();
	}
	
	
	

}
