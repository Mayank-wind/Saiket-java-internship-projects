import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TextFileAnalyzerApplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("File path: "); Path path = Path.of(scanner.nextLine());
            String content = Files.readString(path);
            long words = content.isBlank() ? 0 : content.trim().split("\\s+").length;
            System.out.println("Lines: " + content.lines().count());
            System.out.println("Words: " + words);
            System.out.println("Characters: " + content.length());
            System.out.print("Search word: "); String search = scanner.nextLine();
            long matches = content.toLowerCase().split("\\s+").length == 0 ? 0 : java.util.Arrays.stream(content.split("\\s+")).filter(word -> word.equalsIgnoreCase(search)).count();
            System.out.println("Occurrences: " + matches);
        } catch (IOException | InvalidPathException exception) { System.out.println("Could not read the file: " + exception.getMessage()); }
    }
}
