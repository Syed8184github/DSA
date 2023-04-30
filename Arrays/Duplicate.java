import java.util.*;
public class Duplicate {
    static int removeDuplicate(int arr[]){
        int rd = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        return rd+1;

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
        System.out.println("The array elements before removing are");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("The array elements after removing are"); 
        int rd = removeDuplicate(arr);
        for(int i=0;i<rd;i++){
            System.out.print(arr[i]+",");  
        } 
    }
}
