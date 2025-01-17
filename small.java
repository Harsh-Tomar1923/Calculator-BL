package Calculator_BL;
import java.util.Scanner;
public class small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={4,7,2,6,3,2,9};
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
    }
}
