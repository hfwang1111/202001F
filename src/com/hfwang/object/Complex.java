package com.hfwang.object;

public class Complex {
	private double real;
	private double image;

	public Complex() {

	}

	public Complex(double real, double image) {
		this.real = real;
		this.image = image;
	}

	public void addComplex(Complex complex0) {
		this.real += complex0.real;
		this.image += complex0.image;
	}

	public static Complex addComplex(Complex complex1, Complex complex2) {
		complex1.addComplex(complex2);
		return complex1;
	}

	public String toString() {
		if (this.real == 0) {
			return "" + this.image + "i";
		} else {
			if (this.image == 0) {
				return "" + this.real;
			} else if (this.real < 0) {
				return this.real + this.image + "i";
			} else
				return this.real + "+" + this.image + "i";
		}
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImage() {
		return image;
	}

	public void setImage(double image) {
		this.image = image;
	}

}
