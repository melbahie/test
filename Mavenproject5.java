package Mavenproject5;
import java.util.*;
public class Mavenproject5 {

    public static void swapi(int []arr)
    {
       int temp=arr[0];
       arr[0]=arr[1];
       arr[1]=temp;
    
    }
    public static void main(String[] args) { 
     
        Scanner input =new Scanner (System.in);
        int arr[];
        arr= new int[2];
        for(int i=0;i<2;i++)
        {
            arr[i]=input.nextInt();
        }
        swapi(arr);
        for(int i=0;i<2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
        
        
    }
    
}