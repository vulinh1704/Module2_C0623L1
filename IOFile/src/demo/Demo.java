package demo;

import java.io.*;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws IOException {
//        File file = new File("demo.txt");
//        //file.createNewFile();
//        System.out.println("Path file: " + file.getAbsolutePath());
//        System.out.println("Time last modified: " + new Date(file.lastModified()));
//        System.out.println("Is file: " + file.isFile());
//        System.out.println("Is directory: " + file.isDirectory());
//        System.out.println("Length: " + file.length());
//        file.delete();

//        File file = new File("demo");
//        file.mkdirs();
//        file.delete();

//        File file = new File("demo.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("Linh is handsome");
//        bufferedWriter.close();

        File file = new File("demo.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }


//        int ch;
//        while ((ch = fileReader.read()) != -1) {
//            System.out.print((char) ch);
//        }
    }
}
