import java.util.*;
public class upat{
    public static void main(String[] args){
        int n=8;
        n-=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==n-1 || j==n-1)
                System.out.print("*" + " ");
                else 
                System.out.print(" " +" ");
            }
            System.out.println();
    }    }
} 
    
