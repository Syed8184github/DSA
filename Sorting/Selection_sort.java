import java.util.*;
public class Selection_sort {
    public static void printArray(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int a = sc.nextInt();
        int arr[] =new int[a];
        System.out.print("enter the array elements:");
        for (int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<arr.length-1;i++){
            int smallest = i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
