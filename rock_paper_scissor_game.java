import java.util.*;
public class rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
       
        if (a.equals("rock")&&b.equals("scissor")){
            System.out.println("winner is :"+ a);
        }else if(a.equals("rock")&& b.equals("paper")){
            System.out.println("Winner is:"+b);
        }else if(a.equals("paper")&& b.equals("scissor")){
            System.out.println("Winner is :"+b);
        }else if(a.equals("paper")&&b.equals("rock")){
            System.out.println("Winner is:"+a);
        }else if(a.equals("scissor")&&b.equals("paper")){
            System.out.println("Winner is:"+a);
        }else if(a.equals("scissor")&&b.equals("rock") ){
            System.out.println("Winner is:"+b);
        }else{
            System.out.println("the draw occurred. Play again!");
        }
    }
}
