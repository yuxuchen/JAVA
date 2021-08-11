import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("your choice:");
        String a = scanner.nextLine();
        switch(a){
            case "rock":
                System.out.println("paper");
                break;
            case "paper":
                System.out.println("scissors");
                break;
            case "scissors":
                System.out.println("rock");
                break;
            default:
                System.out.println("Options: rock, scissors, paper!!!");

        }

    }
}
