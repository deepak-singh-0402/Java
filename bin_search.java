package searching_sorting;

import java.util.Scanner;

public class bin_search {
    public static void main(String[] args) {
        //bin_search obj = new bin_search();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Number found at index : " + searching(arr,size,6));



    }
    public static int searching(int[] a, int n, int key){
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=((l+h)/2);
            if(key==a[m]){
                return m;
            }else if(key<a[m]){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return -1;
    }
}