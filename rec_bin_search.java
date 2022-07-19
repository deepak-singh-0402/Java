package searching_sorting;

import java.util.Scanner;

public class rec_bin_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        /*rec_bin_search obj=new rec_bin_search();
        int arr[] = {15,21,47,67,78};*/
        System.out.println("Number found at index : " + bin_recursive(arr,47,0,arr.length-1));

    }
    public static int bin_recursive(int[] a, int key, int l, int h){
        if(l>h)
            return -1;
        else{
            int m=(l+h)/2;
            if(key==a[m])
                return m;
            else if(key>a[m])
                return bin_recursive(a,key,l,m-1);
            else if(key<a[m])
                return bin_recursive(a,key,m+1,h);
        }
        return -1;
    }
}
