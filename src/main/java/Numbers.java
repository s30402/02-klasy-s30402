package src.main.java;

public class Numbers {

    private int A,B,C;

    public Numbers(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int sum() {
        return A + B + C;
    }

    public double average() {
        return (double) sum() / ( isNull(A) + isNull(B) + isNull(C) );
    }

    public int min() {
        return Math.min(A,Math.min(B,C));
    }

    public int max() {
        return Math.max(A,Math.max(B,C));
    }

    public double geometric() {
        double  nth = Math.pow(A*B*C, 1 / (isNull(A)+isNull(B)+isNull(C)) ) * 100;
                nth = Math.round(nth);
                nth/=100;

        return nth;
    }

    public double isNull(int n) {
        if (n != 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
