package view;

import controller.ThreadCalc;

public class VisaoPrincipal {
	public static void main(String[] args) {

int a = 12;
int b = 4;

		for (int op = 0; op <= 3; op++) {
			
		
		Thread t = new ThreadCalc(a, b, op);
		t.start();
		
		}
	}
}
