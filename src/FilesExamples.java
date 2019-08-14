
import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.Arrays;

public class FilesExamples {

    public static void main(String[] args) {
//        String folderPath = "./data";
//        Path dataFile = Paths.get(folderPath, "data.txt");
//        try {
////            if(Files.notExists(Paths.get(folderPath)));
////            Files.createDirectory(Paths.get(folderPath));
//
//            if(Files.notExists(dataFile));
//            Files.createDirectory(dataFile);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get("data", "groceries.txt");
        try {
            //Files.write(filepath, groceryList);

        Path groceriesPath = Paths.get("data", "groceries.txt");
        //List<String> groceryList = Files.readAllLines(groceriesPath);

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));

        }
            Files.write(
                    Paths.get("data", "groceries.txt"),
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );
            List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
            List<String> newList = new ArrayList<>();

            for (String line : lines) {
                if (line.equals("milk")) {
                    newList.add("cream");
                    continue;
                }
                newList.add(line);
            }

            Files.write(Paths.get("data", "groceries.txt"), newList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
