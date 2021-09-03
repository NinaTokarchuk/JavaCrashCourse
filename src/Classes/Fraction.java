package Classes;

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!

    //Add two fractions
    public static long gcd(long a, long b) {
        while (b !=0) {
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    //Recursive function
    //private long gcd(long a, long b) {
    //    return b == 0 ? a : gcd(b, a % b);
    //}

    public Fraction add(Fraction f2) {
        long numerator = this.top * f2.bottom + f2.top * this.bottom;
        long denominator = this.bottom * f2.bottom;

        long gcd = gcd(numerator, denominator);
        numerator/=gcd;
        denominator/=gcd;

        Fraction result = new Fraction(numerator, denominator);
        return result;
    }

    @Override
    public String toString() {
        return this.top + "/" + this.bottom;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        System.out.println(f1.add(new Fraction(3,9)));
    }
    //...and make this class string representable
}
