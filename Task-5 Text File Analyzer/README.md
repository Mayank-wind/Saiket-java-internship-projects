# Text File Analyzer

A Java file-processing utility that reads a text file and reports line, word, and character statistics. It also allows the user to search for a specific word.

## Features

- Reads text using Java NIO file APIs.
- Counts lines, words, and characters.
- Searches the file for a user-provided word.
- Handles invalid file paths and file read failures.
- Uses a package namespace: `com.mayank.textanalyzer`.

## Concepts Demonstrated

- File input/output with `Files.readString`
- `Path` and NIO APIs
- String manipulation
- Streams and filtering
- Checked and unchecked exception handling

## Requirements

- Java 17 or later
- IntelliJ IDEA, or a terminal with `javac` and `java`

## Run from IntelliJ IDEA

1. Open this folder in IntelliJ IDEA.
2. Open `src/TextFileAnalyzerApplication.java`.
3. Run the `main` method.
4. Enter the full path to a text file.

## Run from the Terminal

```bash
javac -d out src/TextFileAnalyzerApplication.java
java -cp out com.mayank.textanalyzer.TextFileAnalyzerApplication
```

## Example

```text
File path: sample.txt
Lines: 3
Words: 12
Characters: 68
Search word: Java
Occurrences: 2
```

## Important Note

The source file currently uses the package `com.mayank.textanalyzer`. For a conventional Java layout, it can later be moved to `src/com/mayank/textanalyzer/TextFileAnalyzerApplication.java`.

## Possible Enhancements

- Count punctuation-free words correctly.
- Make searches case-insensitive and punctuation-aware.
- Display the most frequent words.
- Add support for multiple files and exportable reports.
