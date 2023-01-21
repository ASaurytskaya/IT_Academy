package additional.test210123.api;

import additional.test210123.Playlist;
import additional.test210123.Song;

import java.util.List;

public interface IFilter {
    Playlist filter(String filter, List<Song> allSongs);
}
