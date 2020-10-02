package com.company.Learn;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Menu for user to select one from Rock, Paper, Scissors
        int i = 0;
        String optionOne = "0-Rock";
        String optionTwo = "1-Paper";
        String optionThree = "2-Scissors";
        int userScore =0;
        int machineScore =0;
        while (i <= 5) {

            System.out.println(optionOne + "\n" + optionTwo + "\n" + optionThree);
            System.out.println("Enter the digit corresponding to your choice of input : ");
            //get the input from the user
            int userInput = scanner.nextByte();

            //get the input from your machine
            Random random = new Random();
            int upperBound = 3;
            int machineInput = random.nextInt(upperBound);
            System.out.println("Your choice " + userInput + " vs, the choice of your machine " + machineInput);
            if (userInput == machineInput) {
                System.out.println("Game-"+i+",There is a Tie!");
            } else if (userInput == 0 && machineInput == 1) {
                System.out.println("Game-"+i+",You lost this game! Your PC won!");
                machineScore++;
            } else if (userInput == 0 && machineInput == 2) {
                System.out.println("Game-"+i+",Congrats,You Win!!");
                userScore++;
            } else if (userInput == 1 && machineInput == 2) {
                System.out.println("Game-"+i+",You lost this game! Your PC won!");
                machineScore++;
            } else if (userInput == 1 && machineInput == 0) {
                System.out.println("Game-"+i+",Congrats,You Win!!");
                userScore++;
            } else if (userInput == 2 && machineInput == 0) {
                System.out.println("Game-"+i+",You lost this game! Your PC won!");
                machineScore++;
            } else if (userInput == 2 && machineInput == 1) {
                System.out.println("Game-"+i+",Congrats,You Win!!");
                userScore++;
            }

            i++;
        }
        if(userScore > machineScore){
            System.out.println("Your score is "+userScore);
            System.out.println("YOU ARE THE FINAL WINNER!CONGRATULATIONS!!!");
        }else if(userScore == machineScore){
            System.out.println("THERE IS A TIE!!");
        }else{
            System.out.println("Your PC scored "+machineScore+" and you scored "+userScore);
            System.out.println("YOU LOSE, BETTER LUCK NEXT TIME!");
        }
    }
}
