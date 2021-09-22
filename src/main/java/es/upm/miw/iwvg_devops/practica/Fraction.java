package es.upm.miw.iwvg_devops.practica;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public boolean isProper() {
        return (this.numerator < this.denominator);
    }

    public boolean isImproper() {
        return (this.numerator >= this.denominator);
    }

    public boolean isEquivalent(Fraction fraction) {
        return (fraction.decimal() == this.decimal());
    }

    public Fraction add(Fraction fraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        result.denominator = this.denominator * fraction.denominator;
        return fraction;
    }

    public Fraction multiply(Fraction fraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * fraction.numerator;
        result.denominator = this.denominator * fraction.denominator;
        return result;
    }

    public Fraction divide(Fraction fraction) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * fraction.denominator;
        result.denominator = this.denominator * fraction.numerator;
        return result;
    }
}
