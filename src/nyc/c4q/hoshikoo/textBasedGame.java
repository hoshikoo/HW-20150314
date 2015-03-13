/**
 * Created by Hoshiko on 3/12/15.
 */

import java.util.Scanner;
import java.util.Random;
public class textBasedGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userWon=0;
        int myWon=0;
        System.out.print("Let's play Rock Paper Scissors!  We will try 5 times.  Please type your choice!");
        for (int i = 0; i<5; i=i+1){

            String userChoice = input.next();

            boolean rock = userChoice.equalsIgnoreCase("rock");
            boolean paper = userChoice.equalsIgnoreCase("paper");
            boolean scissors = userChoice.equalsIgnoreCase("scissors");

            String myChoice = null;


            if (rock || paper  || scissors){
                int number = new Random().nextInt(3);

                if (number == 0){
                    myChoice = "Rock";
                }else if (number == 1){
                    myChoice = "Paper";
                }else if (number == 2){
                    myChoice = "Scissors";
                }

                System.out.println("My choice is: "+myChoice);

                boolean myRock = myChoice.equalsIgnoreCase("rock");
                boolean myPaper = myChoice.equalsIgnoreCase("paper");
                boolean myScissors = myChoice.equalsIgnoreCase("scissors");
                //calcurate the total of wins
                //calculate which is the winner
                if ((rock&&myRock)||(paper&&myPaper)||(scissors&&myScissors)){
                    System.out.println("We are even");
                }
                else if((rock&&myScissors)||(scissors||myPaper)||(paper||myRock)){
                    System.out.println("You won");
                    userWon++;
                }
                else if((rock&&myPaper)||(scissors||myRock)||(paper||myScissors)){
                    System.out.println("You lost");
                    myWon++;
                }

                System.out.println("we have "+ (4-i )+ " more times.  Please type your choice!");

            }else{
                System.out.println("Your choice is wrong.  Please try again");
            }


        }
        String winner;
        if (userWon>myWon){
            winner = "You";
        }else{
            winner ="Me";
        }
        System.out.print("You won "+userWon+" times and I won "+myWon+" times.  The winner is..."+ winner);
    }
}
