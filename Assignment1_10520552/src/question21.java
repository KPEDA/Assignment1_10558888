import java.util.Scanner;

public class question21 {
    public static void main(String[] args){
        
        Scanner KEYBOARD = new Scanner(System.in);
        String name;
        int age;
        
         System.out.print("Hey, what's your name? ");
         name = KEYBOARD.next();
         System.out.println();
         
         System.out.print("Ok, " + name + ", how old are you? ");
         age = KEYBOARD.nextInt();
         System.out.println();
         
         if (age < 16)
         {
             System.out.println("You can't drive.");
         }
         if (age < 18)
         {
             System.out.println("You can't vote.");
         }
         if (age < 25)
         {
             System.out.println("You can't rent a car.");
         }
         else
             System.out.println("You can do anything that's legal.");
    }
}
