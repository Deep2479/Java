import java.util.Scanner;

 public class pro5
 
{
   public static void main(String[] args)
   {
    
     Scanner obj = new Scanner(System.in);
 
    System.out.println(" enter your firstname:");
    String firstname = obj.nextLine();

    System.out.println(" enter your surname:");
    String surname = obj.nextLine();

    System.out.println(" enter your lastname:");
    String lastname = obj.nextLine();

    System.out.println("enter your firstname:"+firstname);
    System.out.println("enter your surname:"+surname);
    System.out.println("enter your lasttname:"+lastname);
   }
}