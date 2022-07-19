//counting distinct elements
package hashing_java;
import java.util.Scanner;
import java.util.*;
public class hash_questions1 {
    //Bruteforce approach
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr =new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                if(arr[j]!=arr[i]){
                    count++;
                }
            }
        }
        System.out.println("Distinct numbers are : "+count);
    }*/
    static int countDistinct(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int element : a) {
            set.add(element);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elemeents in array : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr =new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countDistinct(arr));
    }
}