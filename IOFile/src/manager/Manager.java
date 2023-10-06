package manager;

import manager.readAndWrite.ReadAndWriteFileStudent;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
    ArrayList<Student> students;
    ReadAndWriteFileStudent readAndWriteFileStudent;

    public Manager() {
        readAndWriteFileStudent = new ReadAndWriteFileStudent();
        this.students = readAndWriteFileStudent.readFile();
    }

    public void add(Student student) {
        students.add(student);
        readAndWriteFileStudent.writeFile(this.students);
    }

    public void edit(int id, Student newStudent) {
        int index = findById(id);
        students.set(index, newStudent);
        readAndWriteFileStudent.writeFile(this.students);
    }

    public int findById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) return i;
        }
        return -1;
    }


    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
