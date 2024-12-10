import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor_random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String []game={"rock","paper","scissor"};
        String userinput=sc.nextLine();
        String computer=game[random.nextInt(game.length)];
        System.out.println("Computer chose: " + computer);
        if(userinput.equals(computer)){
            System.out.println("it is a tie");
        }else if((userinput.equals("rock")&&computer.equals("scissor"))||
        (userinput.equals("paper")&&computer.equals("rock"))||
        (userinput.equals("scissor")&&computer.equals("paper"))){
            System.out.println("You win");
        }else{
            System.out.println("You loose");
        }
    }
}
