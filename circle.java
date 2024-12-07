import java.util.*;
public class circle{
    public static void main(String[] args){
        int radius = 10;
        for(int i=0;i<=2*radius;i++)
        {
            for(int j=0;j<=2*radius;j++)
            {
                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j = radius, 2));
                if(distance>=radius-0.5 && distance<= radius +0.50)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
    }    }
} 
    
