import java.util.*;
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no elements in array:");
        int s = sc.nextInt();
        boolean flag = false;
        int arr[] = new int[s];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the element you want to search:");
        int search_elemnt = sc.nextInt();
        int lower=0;
        int high = arr.length-1;
        while (lower<=high){
            int mid = (lower+high)/2;

            if(arr[mid]==search_elemnt){
                System.out.println("Element found..... at:");
                flag=true;
                break;
            }
            if(arr[mid]<search_elemnt){
                lower=mid+1;
            }
            if(arr[mid]>search_elemnt){
                high=mid-1;
            }
        }
        if (flag==false){
            System.out.println("element not found");
        }
    }
}
