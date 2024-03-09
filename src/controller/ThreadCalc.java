package controller;

public class ThreadCalc extends Thread {
	
	private int[] mat = new int[5];
	private int soma = 0, indice;
	
	public ThreadCalc(int[] mat, int indice) {
		this.indice = indice;
		for (int i = 0; i < 5; i++) {
			this.mat[i] = mat[i];
		}
	}
	
	@Override
	public void run() {
		try {
			sleep(100 * indice);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(mat[i] + " ");
			soma = soma + this.mat[i];
		}
		System.out.println("TID: " + getId() + " A soma disso é: " + soma);
	}
}
