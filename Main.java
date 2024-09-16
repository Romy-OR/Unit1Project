import java.util.Scanner;
public class Main
{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in); 
      
      // The first 10 questions ask the user to enter a string
      
      System.out.println("Enter a string: "); 
      String string1 = input.nextLine(); 
        
      System.out.println("Enter a string: "); 
      String string2 = input.nextLine(); 
        
      System.out.println("Enter a string: "); 
      String string3 = input.nextLine(); 
        
      System.out.println("Enter a string: "); 
      String string4 = input.nextLine(); 
        
      System.out.println("Enter a string: "); 
      String string5 = input.nextLine(); 
        
      System.out.println("Enter a string: "); 
      String string6 = input.nextLine(); 
        
      System.out.println("Enter a string: "); 
      String string7 = input.nextLine(); 
      
      System.out.println("Enter a string: "); 
      String string8 = input.nextLine(); 
      
      System.out.println("Enter a string: "); 
      String string9 = input.nextLine(); 
      
      System.out.println("Enter a string: "); 
      String string10 = input.nextLine();
      
      // The next 3 questions ask the user to enter a double, integer, and boolean
      
      System.out.println("Enter a double: "); 
      double double1 = input.nextDouble(); 
        
      System.out.println("Enter an integer: "); 
      int integer1 = input.nextInt(); 
        
      System.out.println("Enter a boolean: "); 
      boolean boolean1 = input.nextBoolean(); 
      
      // This is the actual mad lib portion of the code 
      
      System.out.println("Thank you, ladies and " + string1 + ". My heart is beating at " + integer1 + " beats a minute. I didn’t prepare a " + string2 + ".");
      System.out.println("Even though I have received a lot of praise, and my newest movie " + string3 + " had a rating of " + double1 + " stars,");
      System.out.println("I never expected to win this " + string4 + " Oscar. I have so many people to " + string5 + ". First and foremost, my ");
      System.out.println(string6 + " costar——who was always in my dressing " + string7 + ", held my " + string8 + " when I was in trouble, and never");
      System.out.println("failed to compliment me or give me a pat on my " + string9 + " when I did well. Most of all, I want to thank you, my");
      System.out.println(string10 + " fans. It is without a doubt " + boolean1 + " that this was not possible without you. Thank you.");  
  }
}
