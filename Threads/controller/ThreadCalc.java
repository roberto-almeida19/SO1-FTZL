package controller;

import java.lang.Thread;

public class ThreadCalc extends Thread {
	private int a, b, op;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		calc();
		super.run();
	}

	public ThreadCalc(int a, int b, int op) {
		this.a = a;
		this.b = b;
		this.op = op;

	}

	private void calc()  {
		try {
			Thread.sleep(op*100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int res = 0;
		String operacao="";

		switch (op) {
		case 0:
			res = a+b;
			operacao="+";
			break;
		case 1:
			res = a-b;
			operacao="-";
			break;
		case 2:
			res = a*b;
			operacao="*";
			break;
		case 3:
			res = a / b;
			operacao="/";
			break;

		
		}
		System.out.println(a+" "+operacao+" "+b+" = "+ res);

	}

}
