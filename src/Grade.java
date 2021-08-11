import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name:");
        String name = scanner.nextLine();
        System.out.print("Input your last year Math grade:");
        int math = scanner.nextInt();
        System.out.print("Input your this year Math grade:");
        int math2 = scanner.nextInt();
        double change = (math2-math)*100/math;
        System.out.printf("Hi,%s,your grade variation is:%.1f%%\n", name,change);
        if (change > 0){
            System.out.println("You make a progress!");
        }
        else System.out.println("You need try harder!");
    }
}
