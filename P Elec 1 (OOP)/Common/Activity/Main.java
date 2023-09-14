import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    // String name;

    public static void main(String[] args) {
        Main main = new Main();
        int i;

        Sport sport = new Sport("Soccer");
        Sport sport2 = new Sport("Feelings");
        Sport sport3 = new Sport();

        System.out.println("Input sport's name: ");
        sport.setName(main.scan.nextLine());

        System.out.println("Sport's name is : " + sport.getName());

        // for (i = 0; i < 3; i++) {
        // String temp = "sport" + i;
        // Sport temp = new Sport();
        // }

    }

    // public void display() {
    // this.name = "name";
    // }
}
