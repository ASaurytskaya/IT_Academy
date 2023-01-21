package additional.test210123;

import java.util.List;

public class Song {
    private String name;
    private String artist;
    private int time;
    private List<String> genre;
    private List<String> mood;

    public Song(String name, String artist, int time) {
        this.name = name;
        this.artist = artist;
        this.time = time;
    }

    public List<String> getGenre() {
        return this.genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getMood() {
        return this.mood;
    }

    public void setMood(List<String> mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        int minutes = (this.time % 3600) / 60;
        int seconds = this.time % 60;
        return String.format("%s – %s %d:%d", this.name, this.artist, minutes, seconds);
    }
}
