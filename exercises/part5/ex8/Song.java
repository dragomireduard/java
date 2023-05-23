package part5.ex8;

public class Song {
    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    public boolean equals(Song compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Song)){
            return false;
        }

        Song comparedSong = (Song) compared;

        if(this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name) && this.durationInSeconds == comparedSong.durationInSeconds){
            return true;
        }

        return false;
    }


    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
