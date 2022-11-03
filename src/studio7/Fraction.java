package studio7;

public class Fraction {
	int numerator,denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public Fraction fractionSum(Fraction A) {
		int newNumerator = (this.numerator*A.denominator) + (this.denominator*A.numerator);
		int newDenominator=this.denominator*A.denominator;
		return new Fraction(newNumerator,newDenominator);
	}
	
	public Fraction fractionMuti(Fraction A) {
		int newNumerator = this.numerator*A.numerator;
		int newDenominator=this.denominator*A.denominator;
		return new Fraction(newNumerator,newDenominator);
	}
	
	public Fraction fractionreciprocal() {
		int newNumerator = this.denominator;
		int newDenominator=this.numerator;
		return new Fraction(newNumerator,newDenominator);
	}
	
	public Fraction FractionSimplify() {
		int p = this.numerator;
		int q = this.denominator;
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		int newNumerator = this.denominator / p;
		int newDenominator=this.numerator / p;
		return new Fraction(newNumerator,newDenominator);
	}
	
}
