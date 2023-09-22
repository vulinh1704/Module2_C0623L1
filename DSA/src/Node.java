import java.util.List;

public class Node<E> {
    public E element;
    public Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}


class LinkedList<E> {
    public Node<E> head; // null
    public Node<E> tail; // null

    LinkedList() {}

    public void addLast(E e) {
        Node<E> node = new Node<>(e);
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void show() {
        Node<E> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.element);
            currentNode = currentNode.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.addLast(4);
//        linkedList.addLast(5);
//        linkedList.addLast(7);
//        linkedList.show();

        List<Integer> listInJava = new java.util.LinkedList<>();
        listInJava.add(1);
        listInJava.add(5);
        for (Integer element : listInJava) {
            System.out.println(element);
        }
    }
}