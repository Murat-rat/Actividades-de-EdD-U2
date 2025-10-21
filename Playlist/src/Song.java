public class Song {
    String name;
    int duration;
    Song next;

    public Song(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.next = null;
    }
}