package recursion;

public class factorial {
    public int fact(int n){
        int f=1;
        while(n>0){
            f*=n;
            n=n-1;
        }
        return f;
    }
    public int factrecursion(int n){
        if(n==0)
            return 1;
        return factrecursion(n-1) * n;
    }

    public static void main(String[] args) {
        factorial obj = new factorial();
        System.out.println(obj.fact(5));
        System.out.println(obj.factrecursion(6));
        //System.out.println("Factorial : "+ obj.fact(5));
    }
}
