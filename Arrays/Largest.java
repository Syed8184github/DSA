import java.util.*;
public class Largest {
    public static int getLargest(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>res){
                res=arr[i];
            }
    }
    return res;
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The maximum element in the array is "+getLargest(arr));
    }
}
