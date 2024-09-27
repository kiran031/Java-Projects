import java.util.*;
public class bank {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int i =0;
        String History[] = new String[50];

        int MinimumBalance = 500;
        int balance = 1000;

        System.out.println("Account Holder Name : ");
        String AccountHolder = sc.nextLine();

        boolean condition = true;
        while(condition){

        System.out.println(); 
        System.out.println("What You Want To Do : ");
        int Views = sc.nextInt();
        
        if(Views == 1){
            if(MinimumBalance < balance){
               System.out.println("Name : " + AccountHolder + "\n" + "Balance "+ balance);
               System.out.println(); 
            }  
            
            else{
                System.out.println("Account Not Has The Sufficient Balance ");
                System.out.println(); 
            }
        }

        else if(Views == 2){
            System.out.println("How Much Money You Want To Add : ");
            int amount = sc.nextInt();
            balance = balance+amount;
            System.out.println( "Name : " + AccountHolder + "\n" + "Balance "+ balance); 
            History[i] = "The Amount "+ amount + " Is Credited ";
            i++;
            System.out.println();   
        } 
        
        else if(Views == 3){
            System.out.println("How Much Money You Want To WithDraw : ");
            int amount = sc.nextInt();
            balance = balance-amount;
            System.out.println( "Name : " + AccountHolder + "\n" + "Balance "+ balance);
            History[i] = "The Amount "+ amount + " Is Debited "; 
            i++;
            System.out.println(); 
              
        }

        else if(Views == 4){
            for(int j = i;j>=i-5;j--){
              if(j<0) {
                break;
              }
              else{
                System.out.println(History[j]);
              }
            }
        }

        else{
            System.out.println("You Are Exiting From The Bank :");
            condition = false;  
               
        }   

              
    }
        

  }
 
}

