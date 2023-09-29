class Music {
    private int id;
    private String title, genre, artist;

    Music() {
    }

    Music(int id) {
        this.id = id;
        this.title = "Title" + id;
        this.genre = "Genre" + id;
        this.artist = "Artist" + id;
    }

    // setters
    protected void setId(int id) {
        this.id = id;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }

    protected void setArtist(String artist) {
        this.artist = artist;
    }

    // getters
    protected int getId() {
        return this.id;
    }

    protected String getTitle() {
        return this.title;
    }

    protected String getGenre() {
        return this.genre;
    }

    protected String getArtist() {
        return this.artist;
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Title: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Artist: " + this.artist + "\n");
    }

}