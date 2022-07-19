package recursion;

public class headrecursiondemo {
    public void calculate(int n) {
        if (n > 0) {
            calculate(n-1);
            int k = n * n;
            System.out.println(k);
            //calculate(n-1);
        }
    }

    public static void main(String[] args) {
        headrecursiondemo obj = new headrecursiondemo();
        obj.calculate(4);
    }
}
