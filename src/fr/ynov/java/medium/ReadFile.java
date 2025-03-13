package fr.ynov.java.medium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        copyFileContent(new File("src/fr/ynov/java/medium/test.txt"));
    }

    public static File createDirectory(String directoryName) {
        try{
            File directory = new File("src/fr/ynov/java/medium/"  + directoryName);
            directory.mkdir();
            return directory ;
        }catch(Exception e){
            System.err.println(e);
            return null;
        }
    }

    public static void createFile(String fileName, String content) {
        try {
            File file = new File("src/fr/ynov/java/medium/ReadFiletest/" + fileName);
            file.createNewFile();
            FileWriter fw = new FileWriter("src/fr/ynov/java/medium/ReadFiletest/" + fileName);
            fw.write(content);
            fw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void readFile(File directory) {
        File[] files = directory.listFiles();
        for (File file : files) {
            try{
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    System.out.println(line);
                }
                reader.close();
            }catch (Exception e){
                System.err.println(e);
            }
        }
    }

    public  static void copyFileContent(File file) {
        try {
            Scanner reader = new Scanner(file);
            String allContent = "";
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                allContent = allContent + line + " ";
            }
            File newFile =  new File("src/fr/ynov/java/medium/FileCopied");
            file.createNewFile();
            FileWriter fw = new FileWriter(newFile);
            fw.write(allContent);
            fw.close();
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
