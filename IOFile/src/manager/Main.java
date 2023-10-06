package manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
//        manager.add(new Student(4, "Lin2", 5));
        manager.edit(4, new Student(4, "Dân", 22));

        for (Student student: manager.getStudents()) {
            System.out.println(student);
        }
    }
}
