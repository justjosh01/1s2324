import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop, num;

        System.out.print("How many music you want to create?: ");
        num = scanner.nextInt();

        Music[] music = new Music[num];

        for (loop = 0; loop < music.length; loop++) {
            // music[loop] = new Music(loop + 1);
            music[loop] = new Music();

            System.out.println("\nInput for music " + (loop + 1) + " ...");

            System.out.print("ID: ");
            music[loop].setId(scanner.nextInt());
            scanner.nextLine();// solves the nextInt issue

            System.out.print("Title: ");
            music[loop].setTitle(scanner.nextLine());

            System.out.print("Genre: ");
            music[loop].setGenre(scanner.nextLine());

            System.out.print("Artist: ");
            music[loop].setArtist(scanner.nextLine());
        }
        System.out.println("Congratulations you have successfully created " + music.length + " Music!!!");
        System.out.println("\n*************Result*************\n");

        for (loop = 0; loop < music.length; loop++) {
            System.out.println("ID: " + music[loop].getId());
            System.out.println("Title: " + music[loop].getTitle());
            System.out.println("Genre: " + music[loop].getGenre());
            System.out.println("Artist: " + music[loop].getArtist() + "\n");
        }
        System.out.println("Thank you...");
        // for (loop = 0; loop < music.length; loop++) {
        // music[loop].display();
        // }
    }

}
