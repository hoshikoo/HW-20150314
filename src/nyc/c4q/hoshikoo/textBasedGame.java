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
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Hello, "+userName+".  Let's play Rock Paper Scissors!");
        System.out.println("Whoever wins 3 times first will win the game.\nPlease type your choice!");


        int count = 0;
        while ((userWon <= 2) && (myWon<=2)){
            count=count+1;
            //System.out.println(count);
            String userChoice = input.next();

            boolean rock = userChoice.equalsIgnoreCase("rock");
            boolean paper = userChoice.equalsIgnoreCase("paper");
            boolean scissors = userChoice.equalsIgnoreCase("scissors");

            System.out.println("Please type your choice!");

            if (rock){
                System.out.println("  _______ ");
                System.out.println(" (____   '——-");
                System.out.println("(_____)");
                System.out.println("(_____)");
                System.out.println("(____)");
                System.out.println(" (____)__.——-");
                System.out.println();
            }else if(paper){
                System.out.println("       _______");
                System.out.println("  ____(____   '---");
                System.out.println(" (______");
                System.out.println("(_______");
                System.out.println(" (_______");
                System.out.println("   (__________.---");
                System.out.println();

            }else if (scissors){
                System.out.println("       _______");
                System.out.println("  ____(____   '---");
                System.out.println(" (______");
                System.out.println("(__________");
                System.out.println("      (____)");
                System.out.println("       (___)__.---");
                System.out.println();

            }

            String myChoice = null;

            if (rock || paper  || scissors){
                int number = new Random().nextInt(3);

                if (number == 0){
                    myChoice = "Rock";
                    System.out.println("    _______");
                    System.out.println("---'   ____)");
                    System.out.println("      (_____)");
                    System.out.println("      (_____)");
                    System.out.println("      (____) ");
                    System.out.println("---.__(___)");
                    System.out.println();

                }else if (number == 1){
                    myChoice = "Paper";
                    System.out.println("    _______");
                    System.out.println("---'   ____)____");
                    System.out.println("          ______)");
                    System.out.println("          _______)");
                    System.out.println("         _______)");
                    System.out.println("---.__________)");
                    System.out.println();


                }else if (number == 2){
                    myChoice = "Scissors";
                    System.out.println("    _______");
                    System.out.println("---'   ____)____");
                    System.out.println("          ______)");
                    System.out.println("       __________)");
                    System.out.println("      (____)");
                    System.out.println("---.__(___)");
                    System.out.println();
                }

                System.out.println("My choice is: "+myChoice);

                boolean myRock = myChoice.equalsIgnoreCase("rock");
                boolean myPaper = myChoice.equalsIgnoreCase("paper");
                boolean myScissors = myChoice.equalsIgnoreCase("scissors");
                //count the total of wins
                //calculate which is the winner
                if ((rock&&myRock)||(paper&&myPaper)||(scissors&&myScissors)){
                    System.out.println("***We are even***");
                    count--;
                }
                else if((rock&&myScissors)||(scissors&&myPaper)||(paper&&myRock)){
                    System.out.println("***You won!***");
                    userWon++;
                }
                else if((rock&&myPaper)||(scissors&&myRock)||(paper&&myScissors)){
                    System.out.println("***You lost!***");
                    myWon++;
                }

                System.out.println("Your Score: "+userWon+", My Score: "+myWon+ ".");

            }else{
                System.out.println("Your choice is wrong.  Please try again");
            }

        }

        String wonOrLost=null;
        if (userWon >= 3){
            wonOrLost = "　　　　　　　　 ★\n" +
                        "　　　　 　　 [~~~] +::.゜ ゜ ゜゜｡･｡　.　.*\n" +
                        "　　　 ∧ ∧　 [~~~~~]　　Congratulations, "+userName + ", you won!！\n" +
                        "　　　(*ﾟーﾟ)[~~~~~~~] 　　　 ゜::.゜ ゜゜゜｡･｡\n" +
                        "　　　 ﾉ　つ━━━━━\n" +
                        "　　～　 ﾉ\n" +
                        "((　　(/ J";
        }else if (myWon>=3){
            wonOrLost ="　　　　　　　.o゜*。o\n" +
                       "　　　　　　,／⌒ヽ*゜*\n" +
                       "　  ∧_∧　／ヽ 　 　）｡*o\n" +
                       "　(*ﾟーﾟ)丿゛￣￣' ゜\n" +
                       "ノ/　 /   Sorry, "+userName+ ", you lost.\n" +
                       "ノ￣ゝ";
        }
        //System.out.println("Your Score: "+userWon+", My Score: "+myWon);
        System.out.println();
        System.out.println(wonOrLost);

    }
}
