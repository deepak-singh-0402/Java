package questions;
import java.util.*;

public class longestprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr= new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(arr,n));
    }
    static String longestCommonPrefix(String arr[], int n){
        // code here

        String prefix=arr[0];
        for(int i=1;i<n;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

        if(prefix.length()==0){
            return "-1";
        }else{
            return prefix;
        }
    }
}
