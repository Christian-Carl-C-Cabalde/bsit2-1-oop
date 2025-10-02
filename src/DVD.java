public class DVD {
    private int duration = 0;
    private String rating = "";
    private String genre = "";

    public DVD (String itemId, String title, String author, int duration, String rating, String genre) {
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
    }
}
