import java.util.Random;

public class ContinuedFraction {
    private int[] a;
    private double x;
    private int n;

    public ContinuedFraction(double x, int[] a) {
        this.x = x;
        this.a = (int[])a.clone();
        this.n = a.length;
    }

    public ContinuedFraction(int x, int n) {
        this.n = n;
        this.x = (double)x;
        this.a = new int[n];
        Random random = new Random();

        for(int i = 0; i < n; ++i) {
            this.a[i] = random.nextInt(10) + 1;
        }

    }

    public double calculate() {
        double result = (double)this.n;

        for(int i = this.n - 1; i >= 0; --i) {
            result = (double)this.a[i] + this.x / result;
        }

        return result;
    }

    public ContinuedFraction add(ContinuedFraction cf2) {
        int[] a2 = cf2.getA();
        int[] result = new int[Math.max(this.a.length, a2.length)];

        for(int i = 0; i < result.length; ++i) {
            int a1i = i < this.a.length ? this.a[i] : 0;
            int a2i = i < a2.length ? a2[i] : 0;
            result[i] = a1i + a2i;
        }

        return new ContinuedFraction(this.x, result);
    }

    public ContinuedFraction subtract(ContinuedFraction cf2) {
        int[] a2 = cf2.getA();
        int[] result = new int[Math.max(this.a.length, a2.length)];

        for(int i = 0; i < result.length; ++i) {
            int a1i = i < this.a.length ? this.a[i] : 0;
            int a2i = i < a2.length ? a2[i] : 0;
            result[i] = a1i - a2i;
        }

        return new ContinuedFraction(this.x, result);
    }

    public ContinuedFraction multiply(ContinuedFraction cf2) {
        int[] a2 = cf2.getA();
        int[] result = new int[Math.max(this.a.length, a2.length)];

        for(int i = 0; i < result.length; ++i) {
            int a1i = i < this.a.length ? this.a[i] : 1;
            int a2i = i < a2.length ? a2[i] : 1;
            result[i] = a1i * a2i;
        }

        return new ContinuedFraction(this.x, result);
    }

    public ContinuedFraction divide(ContinuedFraction cf2) {
        int[] a2 = cf2.getA();
        int[] result = new int[Math.max(this.a.length, a2.length)];

        for(int i = 0; i < result.length; ++i) {
            int a1i = i < this.a.length ? this.a[i] : 0;
            int a2i = i < a2.length ? a2[i] : 1;
            if (a2i == 0) {
                throw new ArithmeticException("Division by zero");
            }

            result[i] = a1i / a2i;
        }

        return new ContinuedFraction(this.x, result);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A = ");
        sb.append(this.a[0]);

        for(int i = 1; i < this.n; ++i) {
            sb.append(" + ");
            sb.append(this.x);
            sb.append("/(");
            sb.append(this.a[i]);
            sb.append(" + ");
        }

        sb.append(this.x);
        sb.append("/(");
        sb.append(this.a[this.n - 1]);
        sb.append("))");
        return sb.toString();
    }

    public int[] getA() {
        return (int[])this.a.clone();
    }

    public double getX() {
        return this.x;
    }

    public int getN() {
        return this.n;
    }

    public static void demonstration(int x, int n) {
        System.out.println("ЛР 3.5 'ContinuedFraction'");
        ContinuedFraction fraction = new ContinuedFraction(x, n);
        System.out.println("Сгенерированная дробь:");
        System.out.println(fraction);
        double result = fraction.calculate();
        System.out.println("Значение дроби: " + result);
        ContinuedFraction fraction2 = new ContinuedFraction(2.5, new int[]{1, 2, 3});
        ContinuedFraction sum = fraction.add(fraction2);
        System.out.println("Сумма двух дробей:");
        System.out.println(sum);
        ContinuedFraction difference = fraction.subtract(fraction2);
        System.out.println("Разность двух дробей:");
        System.out.println(difference);
        ContinuedFraction product = fraction.multiply(fraction2);
        System.out.println("Произведение двух дробей:");
        System.out.println(product);
        ContinuedFraction quotient = fraction.divide(fraction2);
        System.out.println("Частное двух дробей:");
        System.out.println(quotient);
    }
}
