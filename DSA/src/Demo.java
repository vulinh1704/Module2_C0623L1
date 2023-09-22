import java.util.ArrayList;

class Student {
}

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); // 0
        numbers.add(3); // 1
        numbers.add(5); // 2
        //System.out.println(numbers.get(2));

//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

        //numbers.remove(1);
        numbers.set(1, -10);
        for (Integer element : numbers) {
            System.out.println(element);
        }

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

    }
}
