package additional.test210123.utils;

import additional.test210123.Playlist;
import additional.test210123.Song;
import additional.test210123.api.IFilter;

import java.util.List;

public class MoodFilter implements IFilter {
    @Override
    public Playlist filter(String mood, List<Song> allSongs) {
        Playlist playlist = new Playlist(mood);

        for(Song song : allSongs) {
            if(song.getGenre().contains(mood)) {
                playlist.addSongtoPlaylist(song);
            }
        }

        return playlist;
    }
}
