package view;

import controller.ThreadCalc;

public class Principal {
	
	public static void main(String[] args) {
		int[][] mat = new int[3][5];
		
		for (int i =0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				mat [i][j] = (int)(Math.random()*100) + 1;
			}
			Thread threadCalc = new ThreadCalc(mat[i], i);
			threadCalc.start();
		}
	}
}