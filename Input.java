import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int siz=sc.nextInt();
        int arr[]= new int[siz];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < siz; i++) {
            arr[i]=sc.nextInt();
 
        }
        int sum=0;
        System.out.println("Array Elements are :");
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
           
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));

  
        System.out.println("Enter The Element To Search");
        int r=sc.nextInt();
        int cnt=0;
        for (int i = 0; i < siz; i++) {
            if (arr[i]==r){
                for (int j = i; j < siz-1; j++) {
                    arr[j]=arr[j+1];
                    
                }
                siz--;
                i--;
                cnt++;


            }
            
        }

        if (cnt==0){
            System.out.println("Element Not Found");
        }
        
        else{
            System.out.println("New Array is:");
            for (int i = 0; i < siz; i++) {
                System.out.println(arr[i]+" ");
                
            }

        }
        
        int n1=5;
        for (int i = 1; i < n1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
                
            }
            System.out.println();
            
        } 
        

        }
    
}
