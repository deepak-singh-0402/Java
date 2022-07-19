package recursion;

public class iterationrecdemo {

    public void calciteration(int n){
        while(n>0){
            int k = n*n;
            System.out.println(k);
            n=n-1;
        }
    }

    public void calcrecursion(int n){
        if(n>0){
            int k = n*n;
            System.out.println(k);
            calcrecursion(n-1);
        }
    }


    public static void main(String[] args) {
        iterationrecdemo obj = new iterationrecdemo();
        //obj.calciteration(4);
        obj.calcrecursion(5);
    }
}
