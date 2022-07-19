package searching_sorting;

import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        selection_sorting(arr,size);
        System.out.println("Sorted array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void selection_sorting(int a[], int n){
        for(int i=0;i<n;i++){
            int position=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[position]){
                    position=j;
                }int temp=a[i];
                a[i]=a[position];
                a[position]=temp;
            }
        }
    }
}
