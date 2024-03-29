/*Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M,
 a number. Write a recursive function which returns the last index at which M is found in the 
 array and -1 if M is not found anywhere. Print the value returned. */

 import java.util.Scanner;
public class LastIndex {
    public static int search(int[] arr , int k , int l){
        if(l<0) return -1;
        if(arr[l] == k) return l;
        return search(arr,k,l-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(search(arr,k,arr.length-1));
        sc.close(); 
    }
}
