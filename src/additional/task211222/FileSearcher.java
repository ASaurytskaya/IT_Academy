package additional.task211222;

import java.io.File;
import java.util.Objects;

public class FileSearcher {
private FileSearchResults result = new FileSearchResults();

    public String getFiles(String str) {
        File file = new File(str);
        for(File f : Objects.requireNonNull(file.listFiles())) {
            if(f.isFile()) {
                result.increaseFiles();
                if(f.isHidden()) {
                    result.increaseHiddenFiles();
                }
                if(f.getPath().endsWith(".txt")) {
                    result.increaseTxtFiles();
                }
            }
            if(f.isDirectory()) {
                result.increaseDirectories();
                getFiles(f.getAbsolutePath());
            }
        }
        return this.result.toString();
    }
}
