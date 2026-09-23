
import java.util.Scanner;


public class ArrayBasics{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter Size:");
           int n = sc.nextInt();
           int [] arr =new int[n];

           System.out.println("Enter"+n+"elements:");
           for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

           }
           int sum=0,max=arr[0];
             for(int x:arr){
                sum+=x;
                if(x>max)max=x;

             }
               System.out.println("Sum:"+sum);
               System.out.println("Max:"+max);
               sc.close();
           
       }
}