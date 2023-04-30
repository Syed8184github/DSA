import java.util.*;
public class MoveZerosEnd {
    static void moveZerosEnd(int arr[]){
        int size = arr.length;
        if(size==0 || size ==1){
            return;
        }
        int nz=0;
        int z=0;
        while(nz<size){
            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }else{
                nz++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,4,2,7,0,0,8,0,0};
        moveZerosEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
