package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCarro;

public class Estacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int permissoes = 3;
		Semaphore semaforo =  new Semaphore(permissoes);			
		for (int i = 0; i <10 ; i++) {
			Thread threadNave = new ThreadCarro(i, semaforo);
			threadNave.start();
		}
		
		
	}

}
