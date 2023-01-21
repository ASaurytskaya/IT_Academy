package additional.test210123.utils;

import additional.test210123.Song;

import java.io.*;
import java.util.List;

public class FilesUtils {
    public static boolean writeToFile(String dirName, String playlistName, String playlistDescription, List<Song> songsList) {
        File file = new File(dirName + "/" + playlistName + ".txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            if(playlistDescription != null) {
                writer.write(playlistDescription);
            }
            int count = 1;
            for(Song song : songsList) {
                writer.write(String.format("%d. %s\n", count, song.toString()));
                count++;
            }
        } catch(IOException e) {
            return false;
        }
        return true;
    }

    public static String loadFromFile(String pathToFile) {
        File file = new File(pathToFile);
        if(!file.exists() || !file.isFile()) {
            System.out.println("File is not found.");
            return null;
        }
        StringBuilder builder = new StringBuilder(file.getName()).append("\n");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while(reader.ready()) {
                builder.append(reader.readLine()).append("\n");
            }
        } catch(IOException e) {
            System.out.println("Error during loading from file " + file.getAbsolutePath());
        }
        return builder.toString();
    }
}
