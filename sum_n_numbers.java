package recursion;

public class sum_n_numbers {
    /*public void sum_n(int n){
        if(n>0){
            int sum=0;
            sum += n;
            sum_n(n-1);
            System.out.println(sum);
    }
    }

    public static void main(String[] args) {
        sum_n_numbers obj = new sum_n_numbers();
        obj.sum_n(5);
    }*/
    public int sum(int n){
        return n*(n+1)/2;
    }
    public int sumiteration(int n) {
        int total = 0;
        int i = 1;
        while (i <= n) {
            total += i;
            i += 1;
        }
        return total;
    }
    public int sumrecursion(int n) {
        if (n == 0)
            return 0;
            return sumrecursion(n - 1) + n;
        }

    public static void main(String[] args) {
        sum_n_numbers obj = new sum_n_numbers();
        System.out.println("Sum : "+ obj.sum(5));
        System.out.println("Sum : "+ obj.sumiteration(5));
        System.out.println("Sum : "+ obj.sumrecursion(5));
    }

}

