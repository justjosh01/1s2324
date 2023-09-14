import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Sport sport = new Sport();

        System.out.println("Input sport's name: ");
        sport.setName(main.scan.nextLine());

        System.out.println("Sport's name is : " + sport.getName());

    }
}
