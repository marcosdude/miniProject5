import java.util.Scanner;//first component of the scanner

public class Main 
//main class, this is where my scanner is, and where my pre method print statements are.
{
  public static void main(String[] args)
  //In this code, I go skydiving and we're about to jump.
  {
    System.out.println("Me: I'm scared to jump, I've never skydived before!");
    Scanner scan = new Scanner(System.in);
    System.out.println("Instructor: It's okay! Let's go to your happy place! Do you like kittens or puppies?");
    // This scanner get's the users pet.
    String pet = scan.next(); 
    System.out.println("Instructor: Okay then, think about " + pet + "!" );
    System.out.println("Instructor: Okay! We're gonna jump on 1!");
    //setting up the top of the countdown,
    skydiveLaunchCountDown(5); 
  }

  //second method with the recursion,
  public static void skydiveLaunchCountDown(int countdownnumber) 
    {
    if (countdownnumber == 1)
      {//base case final print statements
      System.out.println("Instructor: Wooooooh!");
      System.out.println("Me: I thought we were jumping at 1 ahhhhh!");
      System.out.println("You're probably wondering how I got here.");
      System.out.println("Hi I'm Marcos and my life, it's kinda crazy.");
      }
    else{
      System.out.println(countdownnumber);
      //This subtracts -1 every time it runs
      countdownnumber--; 
      //recursion
      skydiveLaunchCountDown(countdownnumber);
        }
    }
} 
