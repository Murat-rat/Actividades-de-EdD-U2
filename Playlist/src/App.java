public class App {
    public static void main(String[] args) throws Exception {
        SongPlaylist playlist = new SongPlaylist();

        playlist.addSong("Satisfied", 329);
        playlist.addSong("Hijo de la Luna", 258);
        playlist.addSong("Mujer Contra Mujer", 243);
        playlist.addSong("Yes I'm A Mess", 165);
        playlist.addSong("I Won't", 168);
        playlist.addSong("Finale (Can't Wait To See What You'll Do Next)", 278);
        playlist.addSong("LOVE LETTER", 217);
        playlist.addSong("CYBERNETIC HEART", 187);
        playlist.addSong("Karma", 245);
        playlist.addSong("Blue Bird", 242);
        playlist.addSong("Next Up Forever", 256);
        playlist.addSong("THE STARS ARE FALLING", 236);
        playlist.addSong("No Soy Una De Esas", 209);
        playlist.addSong("INAFAMOUS", 155);
        playlist.addSong("CRIMSON GALAXIES", 203);
        playlist.addSong("La de la Mala Suerte", 250);
        playlist.addSong("A Wolf in Sheep's Clothing", 188);
        playlist.addSong("midnight crisis", 207);

        playlist.printPlaylist();
        System.out.println("-------------------------");
        playlist.getTotalDuration();
        System.out.println("-------------------------");

        playlist.removeSong("Next Up Forever");
        playlist.removeSong("CRIMSON GALAXIES");
        playlist.removeSong("A Wolf in Sheep's Clothing");

        playlist.printPlaylist();
        System.out.println("-------------------------");
        playlist.getTotalDuration();
    }
}
