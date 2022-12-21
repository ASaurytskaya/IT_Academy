package additional.task211222;

public class FileSearchResults {
    private long files = 0;
    private long directories = 0;
    private long hiddenFiles = 0;
    private long txtFiles = 0;

    public void increaseFiles() {
        files++;
    }

    public void increaseDirectories() {
        directories++;
    }

    public void increaseHiddenFiles() {
        hiddenFiles++;
    }

    public void increaseTxtFiles() {
        txtFiles++;
    }

    public String toString() {
        return String.format("Всего папок: %d\nВсего файлов: %d\nВсего скрытых файлов: %d\nВсего текстовых файлов: %d",
                this.directories, this.files, this.hiddenFiles, this.txtFiles);
    }
}
