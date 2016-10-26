package per.jasonxu.neuron.math.algebra.linear.common;

public class Complex implements Computable<Complex> {
	private Float real;
	private Float imaginary;

	public Complex(Float realPart, Float imaginaryPart) {
		this.real = realPart;
		this.imaginary = imaginaryPart;
	}

	public Complex(Float realPart) {
		this.real = realPart;
		this.imaginary = 0.0f;
	}

	public Float getReal() {
		return real;
	}

	public void setReal(Float real) {
		this.real = real;
	}

	public Float getImaginary() {
		return imaginary;
	}

	public void setImaginary(Float imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public Complex add(Complex augend) {
		return new Complex(this.real + augend.getReal(), this.imaginary + augend.getImaginary());
	}

	@Override
	public Complex sub(Complex minuend) {
		return new Complex(this.real - minuend.getReal(), this.imaginary - minuend.getImaginary());
	}

	@Override
	public Complex multiply(Complex multiplicand) {
		return new Complex(this.real * multiplicand.getReal() - this.imaginary * multiplicand.getImaginary(),
				this.imaginary * multiplicand.getReal() + this.real * multiplicand.getImaginary());
	}

	@Override
	public Complex divide(Complex dividend) {
		Float denominator = dividend.getReal() * dividend.getReal() + dividend.getImaginary() * dividend.getImaginary();
		Float realPartNumerator = this.real * dividend.getReal() + this.getImaginary() * dividend.getImaginary();
		Float imaginaryPartNumberator = this.getImaginary() * dividend.getReal() - this.real * dividend.getImaginary();

		return new Complex(realPartNumerator / denominator, imaginaryPartNumberator / denominator);
	}

	@Override
	public Complex clone() {
		return new Complex(this.real, this.imaginary);
	}

	@Override
	public String toString() {
		return String.valueOf(this.real) + ((this.imaginary - 0.0 < 0.00001 && this.imaginary - 0.0 > -0.00001)
				? "" : " + " + String.valueOf(this.imaginary) + "i");
	}
}
