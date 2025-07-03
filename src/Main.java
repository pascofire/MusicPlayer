import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Song s1 = new Song("blue","abc",123,"null");
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(s1);

    Album album= new Album ("playlist 1",songs);

    album.addSong("goosebumps","Travis scott", 210,"null");
    album.addSong("butterfly effect","Travis", 210,"null");
    album.addSong("loco contigo","DJ snake", 351,"E:\\folders\\musicplayer\\localsongs\\Loco Contigo.mp3");

    Player player = new Player("Loco Contigo.wav");
    player.playAudio();
    }
}