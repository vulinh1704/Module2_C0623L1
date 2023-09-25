import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Stack <Ngăn xếp>: là cấu trúc dữ liệu danh sách, hoạt động theo cơ chế FILO
        // (First In Last Out)

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(5);
//        stack.push(6);

//        System.out.println(stack.pop()); // 6
//        System.out.println(stack.pop()); // 5
//        System.out.println(stack.pop()); // 1
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.search(1));
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.size());


        // Queue <hàng đợi>: là cấu trúc dữ liệu danh sách, hoạt động theo cơ chế FIFO
        // Vào đầu ra đầu

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.offer(4);
//        System.out.println(queue.poll()); // 1
//        System.out.println(queue.poll()); // 2
//        System.out.println(queue.remove()); // 3
//        System.out.println(queue.remove()); // 4
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());

//        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        queue.add(3);
//        queue.add(5);
//        queue.add(2);
//        queue.add(4);
//        queue.add(1);
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

//        Queue<String> queue = new PriorityQueue<>();
//        queue.add("Dân");
//        queue.add("Mai");
//        queue.add("Hề");
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.addFirst(1);
        dequeue.addFirst(2);
        dequeue.addFirst(3);
        dequeue.addLast(5);

//        System.out.println(dequeue.pollFirst());
//        System.out.println(dequeue.pollFirst());
//        System.out.println(dequeue.pollFirst());

        System.out.println(dequeue.pollLast());
    }
}
