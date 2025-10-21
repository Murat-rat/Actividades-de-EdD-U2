public class SongPlaylist {
    private Song head;

    public void addSong(String name, int duration) {
        Song newSong = new Song(name, duration);
        
        if(head == null) {
            head = newSong;
            return;
        }

        Song currentSong = head;
        while(currentSong.next != null) {
            currentSong = currentSong.next;
        }
        currentSong.next = newSong;
    }

    public void removeSong(String name) {
        if(head == null) {
            return;
        }

        if(head.name == name) {
            head = head.next;
        }

        Song currentSong = head;
        while(currentSong.next != null && currentSong.next.name != name) {
            currentSong = currentSong.next;
        }
        if (currentSong.next != null) {
            currentSong.next = currentSong.next.next;
        }
    }

    public void printPlaylist(){
        Song currentSong = head;
        int number = 1;
        if (head == null) {
            System.out.println("Playlist vacía.");
        }
        while (currentSong != null) { 
            System.out.println(number + ". " + currentSong.name + " (" + currentSong.duration + " s)");
            currentSong = currentSong.next;
            number++;
        }
    }

    public void getTotalDuration() {
        int total = 0;
        Song currentSong = head;
        while (currentSong != null) {
            total = total + currentSong.duration;
            currentSong = currentSong.next;
        }
        System.out.println("Duración total: " + total + " s");
    }
}
