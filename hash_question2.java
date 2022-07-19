//union of two arrays
package hashing_java;
import java.util.*;
public class hash_question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in array1 : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr =new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no of elements in array2 : ");
        int size2=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr2 =new int [size2];
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(uniion(arr,arr2));
    }
    static int uniion(int a[], int b[]){
        Set<Integer> set = new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        System.out.println(set);
        return set.size();
    }
}
