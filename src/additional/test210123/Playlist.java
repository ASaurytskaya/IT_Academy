package additional.test210123;

import additional.test210123.utils.FilesUtils;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songsList = new ArrayList<>();
    private String name;
    private String description;

    public Playlist(String name) {
        this.name = name;
    }

    public void addSongtoPlaylist(Song song) {
        this.songsList.add(song);
    }

    public List<Song> getSongsList() {
        return this.songsList;
    }

    public String getPlaylistName() {
        return name;
    }

    public void setPlaylistName(String name) {
        this.name = name;
    }

    public String getPlaylistDescription() {
        return description;
    }

    public void setPlaylistDescription(String description) {
        this.description = description;
    }

    public boolean savePlaylist(String dirName) {
        boolean isSaved = FilesUtils.writeToFile(dirName, this.name, this.description, this.songsList);
        if(!isSaved) {
            System.out.println("Error during saving playlist \"" + this.name + "\"");
        }
        return isSaved;
    }

    public void printAllSongs() {
        for(Song song : songsList) {
            System.out.println(song);
        }
    }

    public Playlist loadPlaylistFromFile(String pathToFile) {
        String tmp = FilesUtils.loadFromFile(pathToFile);
        if(tmp == null) {
            System.out.println("Correct the path to a file with a playlist.");
            return null;
        }
        String[] list = tmp.split("\n");
        Playlist playlist = new Playlist(list[0].substring(list[0].indexOf(".")));
        for(int i = 1; i < list.length; i++) {
            String[] songDescr = list[i].split("\\d. |[:–\\n]");
            int minutes = Integer.parseInt(songDescr[2]);
            int seconds = Integer.parseInt(songDescr[3]);
            int time = minutes * 60 + seconds;
            Song song = new Song(songDescr[0], songDescr[1], time);
            playlist.addSongtoPlaylist(song);
        }
        return null;
    }
}
