package library;

import library.controller.FileBasedLibrary;
import library.view.ConsoleUserInterface;

import java.io.IOException;
import java.util.ArrayList;

public class LibaryApp {
    public static void main(String[] args) throws IOException {
        ConsoleUserInterface ui =
                new ConsoleUserInterface(new FileBasedLibrary("src/library/books.txt"));
        ui.start();
    }
}
