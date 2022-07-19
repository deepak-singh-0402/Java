package searching_sorting;

import java.util.Scanner;

public class shell_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int gap=n/2;
        while(gap>0){
            int i=gap;
            while(i<n){
                int temp=arr[i];
                int j=i-gap;
                while(j>=0 && arr[j]>temp){
                    arr[j+gap]=arr[j];
                    j=j-gap;
                }
                arr[j+gap]=temp;
                i+=1;
            }
            gap/=2;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }

}
