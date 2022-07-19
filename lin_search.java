package searching_sorting;

import java.util.Scanner;

public class lin_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Number found at index : " + search(arr,size,6));
    }
    public static int search(int a[], int n, int key){
       /* int index=0;
        while(index<n){
            if(a[index]==key)
                return index;
            index = index+1;
        }
        return -1;*/
        for(int i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
