package com.hfwang.object;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex complex1 = new Complex(1.0, 2.0);
		Complex complex2 = new Complex(1.0, 2.0);
		complex1.addComplex(complex1);
		complex1.addComplex(complex2);

		System.out.print(Complex.addComplex(complex1, complex2).toString());

	}

}
