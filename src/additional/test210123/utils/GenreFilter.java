package additional.test210123.utils;

import additional.test210123.Playlist;
import additional.test210123.Song;
import additional.test210123.api.IFilter;

import java.util.List;

public class GenreFilter implements IFilter {
    @Override
    public Playlist filter(String genre, List<Song> allSongs) {
        Playlist playlist = new Playlist(genre);

        for(Song song : allSongs) {
            if(song.getGenre().contains(genre)) {
                playlist.addSongtoPlaylist(song);
            }
        }

        return playlist;
    }
}
