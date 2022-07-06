import java.util.Scanner;

public class Problem_3_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock(1), paper(2): ");

        int your_guess = input.nextInt();
        int computer_guess = (int) (Math.random() * 3);

        if( computer_guess == 0 && your_guess == 1){
            System.out.print("The computer is scissor. You are rock. You won.");
        }
        else if (computer_guess == 0 && your_guess == 2){
            System.out.print("The computer is scissor. You are paper. You lost.");
        }
        else if (computer_guess == 0 && your_guess == 0){
            System.out.print("The computer is scissor. You are scissor. It is a draw.");
        }
        else if (computer_guess == 1 && your_guess == 0){
            System.out.print("The computer is rock. You are scissor. You lost.");
        }
        else if (computer_guess == 1 && your_guess == 2){
            System.out.print("The computer is rock. You are paper. You won.");
        }
        else if (computer_guess == 1 && your_guess == 1){
            System.out.print("The computer is rock. You are rock. It is a draw.");
        }
        else if (computer_guess == 2 && your_guess == 0){
            System.out.print("The computer is paper. You are scissor. You won.");
        }
        else if (computer_guess == 2 && your_guess == 1){
            System.out.print("The computer is paper. You are rock. You lost.");
        }
        else if (computer_guess == 2 && your_guess == 2){
            System.out.print("The computer is paper. You are paper. It is a draw.");
        }
        else{
            System.out.print("Error");
        }
    }

}
