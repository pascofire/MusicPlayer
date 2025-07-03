public class Song {
     String title;
     String artist;
     String album;
     String path;
     int duration;

    public Song(String title, String artist, int duration,String path) {
        this.duration = duration;
        this.title = title;
        this.artist = artist;
        this.path = path;
    }

    public Song(String title, String artist, String album, int duration,String path) {
        this(title, artist, duration,path);
        this.album = album;
    }

    // getters
    public String getTitle() {
        return title;
    }
    public String getAlbum() {
        return album;
    }
    public int getDuration() {
        return duration;
    }
    public String getArtist() {
        return artist;
    }
    public String getPath() {
        return path;
    }


    @Override
    public String toString() {
        return "title: " + title + ", artist: " + artist + ", album: " + album + ", duration: " + duration;
    }

}
