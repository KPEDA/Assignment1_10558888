import java.util.Scanner;

public class question25 {
    public static void main(String[] args)
    {
        Scanner KEYBOARD= new Scanner(System.in);
        String name, result;
        int age;
        
        
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = KEYBOARD.next();
        
        System.out.print("Ok, " + name + ", how old are you? ");
        age = KEYBOARD.nextInt();
        
        
        result = "Please enter a valid age";
        if (age < 16)
        {
            result = "You can't drive";
        }
        else if (age >= 16)
        {
            result = "You can drive but not vote.";
        }
        else if (age >= 18)
        {
            result = "You can vote but not rent a car.";
        }
        else if (age >= 25)
        {
            result = "You can do pretty much anything.";
        }
        else
        {
          result = result;
        }
        
        System.out.print(result + ", " + name);
    }
}
