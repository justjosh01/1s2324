
class Song {
    private String songname;
    private String songwriter;
    private int songid;

    // Setter
    public void setSongname(String songname) {
        this.songname = songname;
    }

    public void setSongwriter(String songwriter) {
        this.songwriter = songwriter;
    }

    public void setSongid(int songid) {
        this.songid = songid;
    }

    // Getter
    public String getSongname() {
        return this.songname;
    }

    public String getSongwriter() {
        return this.songwriter;
    }

    public int getSongid() {
        return this.songid;
    }
}

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song();
        Song song2 = new Song();
        Song song3 = new Song();

        // setting the values
        song1.setSongname("Rococo");
        song1.setSongid(12345);
        song1.setSongwriter("MIMI");

        song2.setSongname("Triple Baka");
        song2.setSongid(54321);
        song2.setSongwriter("Hatsune Miku");

        song3.setSongname("Eine Kleine");
        song3.setSongid(67890);
        song3.setSongwriter("Kenshi Yonezu");

        // getting the values
        String songname1 = song1.getSongname();
        String songwriter1 = song1.getSongwriter();
        int songid1 = song1.getSongid();

        String songname2 = song2.getSongname();
        String songwriter2 = song2.getSongwriter();
        int songid2 = song2.getSongid();

        String songname3 = song3.getSongname();
        String songwriter3 = song3.getSongwriter();
        int songid3 = song3.getSongid();

        System.out.println("Songname: " + songname1 + "\nSongwriter: " + songwriter1 + "\nSong Id: " + songid1);

        System.out.println("\nSongname: " + songname2 + "\nSongwriter: " + songwriter2 + "\nSong Id: " + songid2);

        System.out.println("\nSongname: " + songname3 + "\nSongwriter: " + songwriter3 + "\nSong Id: " + songid3);

    }
}
