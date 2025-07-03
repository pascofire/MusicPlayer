public class Song {
     String title;
     String artist;
     String album;
     int duration;

    public Song(String title, String artist, int duration) {
        this.duration = duration;
        this.title = title;
        this.artist = artist;
    }

    public Song(String title, String artist, String album, int duration) {
        this(title, artist, duration);
        this.album = album;
    }

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

    @Override
    public String toString() {
        return "title: " + title + ", artist: " + artist + ", album: " + album + ", duration: " + duration;
    }

}
