package module10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesUtils {
    private FilesUtils() {
        throw new IllegalStateException("Utility class");
    }
    private static List<String> getLinesFromTextFile(String filePath) throws IOException {

        if (filePath == null) {
            throw new NullPointerException();
        }

        List<String> list = new ArrayList<>();

        FileReader fileReader;

        try {
            fileReader = new FileReader(filePath);
            Scanner scan = new Scanner(fileReader);

            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }

            scan.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }


        return list;

    }


    public static List<String> getLinesFromFile(String filePath){

        List<String> fileLines = null;
        try {
            fileLines = FilesUtils.getLinesFromTextFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File open error.");
        }

        return fileLines;
    }


    public static void saveTextFile(String filePath, String text){
        FileWriter file = null;
        try {
            file = new FileWriter(filePath);
            file.write(text);
        } catch (IOException e) {
            System.out.println("Error save file!");
        }

        if (file!=null){
            try {
                file.close();
            } catch (IOException e) {
                System.out.println("Error close file!");
            }
        }


    }
}
