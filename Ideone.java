import java.util.*;

//Main 
class Ideone
{
    public static void main(String []s)
    {
        int num;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);
         
       
        num=sc.nextInt();
         
        //check condition for +ve, -ve and Zero
        if(num>0)
            System.out.print("Positive");
        else if(num<0)
            System.out.print("Negative");
        else
            System.out.print("Zero");
         
    }
}
