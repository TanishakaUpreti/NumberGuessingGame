import java.util.Scanner;
import java .util.Random;
public class Numberguessinggame {
    private static final int MIN_RANGE=1;
    private static final int MAX_RANGE=100;
    private static final int MAX_ATTEMPTS=10;
    private static final int MAX_ROUNDS=3;
    public static void main(String args[]){
      Random random = new Random();
      Scanner sc= new Scanner(System.in);
      int TotalScore=0;
      System.out.println("--------- Welcome to Number Guessing Game-----------");
      System.out.println("----Total Number Of Rounds : 3---- ");
      System.out.println("---Attemps To Guess The Number In Each Rounds : 10---\n");
      for(int i =1 ;i<=MAX_ROUNDS ; i++){
        System.out.println("\nROUND :"+i);
        int number = random.nextInt(MAX_RANGE)+MIN_RANGE;
        int attempts = 0;
        while(attempts<MAX_ATTEMPTS){
           System.out.print("Enter your guessing number: ");
          if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            sc.next(); // Clear the invalid input
           continue;  // Skip to the next loop iteration
          }
          int GuessNo = sc.nextInt();
           if(GuessNo == number){
            int Score = MAX_ATTEMPTS - attempts;
            TotalScore = TotalScore + Score;
            System.out .println("Congratulation ! You Guess The Number in "+ (attempts+1 )+ "attempts and your Round Score is "+ Score);
            break;
           }
           else if(GuessNo< number){
             System.out.println("The number is greater than the  " + GuessNo + " . Now  " +( MAX_ATTEMPTS-(attempts+1) )+" attempts are left");
           }
           else if(GuessNo> number){
             System.out.println("The number is less than the  " + GuessNo + " . Now  " +( MAX_ATTEMPTS-(attempts+1) )+" attempts are left");
           }
           attempts= attempts +1;
        }
        if (attempts == MAX_ATTEMPTS){
          System.out.println("The random which is generated is " + number +"in "+ i + " rounds . Now no attempt is left");
        }    
        }
        System.out.println (" \nYour TotalScore after completing all the round is : "+ TotalScore);
        sc.close();
      }

    }
  


