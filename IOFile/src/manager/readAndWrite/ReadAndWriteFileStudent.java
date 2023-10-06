package manager.readAndWrite;

import manager.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFileStudent {
    File file = new File("students.csv");

    public void writeFile(ArrayList<Student> list) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student: list) {
                line += student.getId() + "," + student.getName() + "," + student.getAge() + "\n";
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readFile() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(","); // 1, linh, 45 => ['1', 'linh', '45']
                Student student = new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
