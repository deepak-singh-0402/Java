package questions;

import java.util.Scanner;

public class maxsumkadane {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxSubstring(str));
    }
    // maximum difference of 0's and 1's in a string using kadanes algo
    static int maxSubstring(String S) {
        int ans=0;
        int csum=0;
        int val=0;
        for(int i=0;i<S.length();i++) {
            if (S.charAt(i) == '0') {
                val = 1;
            } else if (S.charAt(i) == '1') {
                val = -1;
            }
            if (csum > 0) {
                csum += val;
            } else {
                csum = val;
            }
            if (csum > ans) {
                ans = csum;
            }
        }
        if(ans==0){
            return -1;
        }return ans;
        /*int n=S.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='0'){
                arr[i]=1;
            }
            else{
                arr[i]=-1;
            }
        }
        int ans=Integer.MIN_VALUE,temp=0;
        for(int i=0;i<n;i++){
            temp+=arr[i];
            ans=Math.max(ans,temp);
            temp=Math.max(temp,0);
        }
        return ans;
    }*/
    }

}
