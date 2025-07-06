import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Song s1 = new Song("blue","abc",123,"null");
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(s1);

    Album album= new Album ("playlist 1",songs);

    album.addSong("Sdp-interlude","Travis scott", 210,"E:\\playlist\\sdp-interlude.wav\\");
    album.addSong("Starboy","Weeknd", 210,"\"E:\\playlist\\Starboy.wav\"");
    album.addSong("loco contigo","DJ snake", 351,"E:\\folders\\musicplayer\\localsongs\\Loco Contigo.mp3");
    album.addSong("Von-dutch","Travis scott", 210,"E:\\playlist\\Von-dutch.wav\\");
    album.addSong("The-Less-I-Know-The-Better","Travis scott", 210,"E:\\playlist\\The-Less-I-Know-The-Better.wav\\");
        album.addSong("Let-It-Happen","Travis scott", 210,"E:\\playlist\\Let-It-Happen.wav\\");
        album.addSong("HIGHEST-IN-THE-ROOM","Travis scott", 210,"E:\\playlist\\HIGHEST-IN-THE-ROOM.wav\\");
        album.addSong("Cheri Cheri Lady","Travis scott", 210,"E:\\playlist\\Cheri-Cheri-Lady.wav\\");
        album.addSong("Con-Calma","Travis scott", 210,"E:\\playlist\\Con-Calma.wav\\");

        album.remix();

    }


}