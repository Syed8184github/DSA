import java.util.Scanner;

public class Linear_search {
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
        System.out.print("Enter the element you want to search:");
        int search_elemnt = sc.nextInt();
        for (int i=0;i<s;i++){
            if(search_elemnt==arr[i]){
                System.out.println("Element found at: "+i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }

    }
}
