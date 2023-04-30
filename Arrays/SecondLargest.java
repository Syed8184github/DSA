import java.util.*;
public class SecondLargest {
    public static int secondLarest(int arr[]){
        int max1;
        int max2;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else{
            max1=arr[1];
            max2=arr[0];
        }
        for(int i=3;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if (arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The second largest element is "+secondLarest(arr));
    }
}
