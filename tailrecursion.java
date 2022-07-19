package recursion;

public class tailrecursion {
    public void calculate(int n) {
        if (n > 0) {
            int k = n * n;
            System.out.println(k);
            calculate(n-1);
        }
    }

    public static void main(String[] args) {
        tailrecursion obj = new tailrecursion();
        obj.calculate(4);
    }
}
