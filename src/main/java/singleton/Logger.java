package singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String fileName;
    private FileWriter writer;

    private Logger() {
        this.fileName = "log.txt";
        setWriter();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private void setWriter() {
        try {
            writer = new FileWriter(this.fileName, true);
        } catch (IOException e) {
            System.err.println("Failed to open log file: " + e.getMessage());
        }
    }

    public void write(String input) {
        try {
            if (writer != null) {
                writer.write(input + "\n");
            }
        } catch (IOException e) {
            System.err.println("Failed to write log: " + e.getMessage());
        }
    }

    public void setFileName(String fileName) {
        close();
        this.fileName = fileName;
        setWriter();
    }

    public void close() {
        if (writer == null) return;
        try {
            writer.close();
        } catch (IOException e) {
            System.err.println("Failed to close log file: " + e.getMessage());
        }
    }
}
