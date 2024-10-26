import java.util.Scanner;

public class multifunc_calc {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int choice=0;

        //display a menu bar to do the user

        while (choice!=5) {
            System.out.println("1. For Addition\n 2. For Subtraction\n 3. For Multiplication\n 4. For Division\n 5. For Exit");

            System.out.print("Enter your choice:");
            choice=sc.nextInt();

            if(choice>=1 && choice<=4){
                System.out.print("Enter first number:");
                int num1=sc.nextInt();
                System.out.print("Enter second number:");
                int num2=sc.nextInt();
               
        //if user's choice is 1
            if(choice==1){
                System.out.println("Result="+(num1+num2));
            }
             //if user's choice is 2
            else if(choice==2){
                System.out.println("Result="+(num1-num2));
            }
             //if user's choice is 3
             else if(choice==3){
                System.out.println("Result="+(num1*num2));
            }
             //if user's choice is 4
             else if(choice==4){
                if(num2!=0){
                System.out.println("Result="+(num1/num2));
            }
            else{
                System.out.println("ERROR: Divisble by zero is not allowed. ");
            }
            }
        }
        else if(choice==5){
            System.out.println("Existed from loop...");

        }
       else{
        System.out.println("Enter the correct choice from the menu bar.");
       }
    }
        
    } 
}
