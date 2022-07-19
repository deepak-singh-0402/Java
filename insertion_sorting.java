package searching_sorting;

import java.util.Scanner;

public class insertion_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        insertionsort(arr,size);
        System.out.println("Sorted array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionsort(int[] a, int n){
        for(int i=1;i<n;i++){
            int temp=a[i];
            int position =i;
            while(position>0 && a[position-1]>temp){
                a[position]=a[position-1];
                position=position-1;
            }
            a[position]=temp;
        }
    }
}
