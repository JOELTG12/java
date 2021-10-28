import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class coding_test1 {
    public static void main(String[] args) {
        String question = "What programming language is this coding challenge based on?";
        String choiceOne = "Python";
        String choiceTwo = "Java";
        String choiceThree = "C++";

        String correctAnswer = choiceTwo;
        System.out.println(choiceTwo);

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        // Have the user input an answer
        Scanner scn  = new Scanner(System.in);
        // Retrieve the user's input
        String usr_input = scn.next();
        System.out.println(usr_input);

        // If the user's input matches the correctAnswer...
        if(usr_input.toLowerCase().equals(correctAnswer.toLowerCase())) {
            System.out.println("Congratulations the answer is correct.");
        } else{
            System.out.println("Sorry, Wrong Answer. The correct choice is :"+choiceTwo);
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}


