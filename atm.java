import java.util.*;
public class atm{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Type Of Account");
         String account = sc.nextLine();
         System.out.println(account);
         System.out.println("What You Want TO Do (WithDraw Or CheckBalance) ? :");
         String Process = sc.nextLine();
         if(Process.equals("WithDraw")){
             System.out.println("How Much Amount You Want To WithDraw");
             int amount = sc.nextInt();
             System.out.println("Enter Your 4 Digit Phone Number");
             int pin = sc.nextInt();
             if (pin == 1234) {
                 System.out.println("The Amount " + amount + " WithDraw Is SuccessFull");
             }
             else{
                 System.out.println("You Entered The Wrong Number");
             }
         }
         else if(Process.equals("CheckBalance")){
             System.out.println("You Have XXXX Amount In Your Account");
         }
         else{
             System.out.println("Invalid Input");
         }
    }
}
