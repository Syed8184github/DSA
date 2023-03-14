import java.util.*;
public class Insertion_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("enter the array elements:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=1;i< arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
//            placement
            arr[j+1]=current;
        }
        printArray(arr);
    }
}
