package module9;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class TestModule9 {

    private String dogs;

    public TestModule9(String dogs) {
        this.dogs=dogs;
    }

    public static void main(String[] args) {
        ArrayList<TestModule9> dogs = new ArrayList<>();
        TestModule9 begemot = new TestModule9("Бегемот");
        TestModule9 zefir = new TestModule9("Зефир");
        TestModule9 rembo = new TestModule9("Рембо");
        TestModule9 muha = new TestModule9("Муха");

        dogs.add(begemot);
        dogs.add(zefir);
        dogs.add(rembo);
        dogs.add(muha);

        int begemotIndex = dogs.indexOf(begemot);
        System.out.println(begemotIndex);

        System.out.println("***********************MyArrayList***********************");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList);

        System.out.print("Remove by index: ");
        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println("Size: " + arrayList.size());

        System.out.println("Get by index: ");
        arrayList.get(2);

        System.out.print("Clear: ");
        arrayList.clear();
        System.out.println(arrayList);

        System.out.println("Size " + arrayList.size());

        MyArrayList<String> arrayList1 = new MyArrayList<>();
        arrayList1.add("Q");
        arrayList1.add("Z");
        System.out.println(arrayList1);

        System.out.print("Remove by index: ");
        arrayList1.remove(0);
        System.out.println(arrayList1);

        System.out.println("***********************MyLinkedList***********************");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("Size: " + list.size());

        System.out.println("Get by index: " + list.get(0));

        System.out.println("Remove by index: " + list.remove(2));
        System.out.println(list);

        System.out.print("Clear: ");
        list.clear();
        System.out.println(list);

        MyLinkedList<String> list1 = new MyLinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        System.out.println("Remove by index: " + list1.remove(2));
        System.out.println(list1);

        System.out.print("Clear: ");
        list1.clear();

        System.out.println("Size: " + list1.size());

        System.out.println("***********************MyQueue***********************");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);  queue.add(2);  queue.add(3);  queue.add(4);  queue.add(5);
        System.out.println(queue);

        System.out.println("Return first element from queue: " + queue.peek());
        System.out.println("Remove first element from queue: " + queue.poll());
        System.out.println(queue);

        System.out.println("Remove first element from queue: " + queue.poll());
        System.out.println(queue);
        System.out.println("Size queue: " + queue.size());
        System.out.print("Clear queue: ");
        queue.clear();
        System.out.println(queue);
        queue.add(1);
        System.out.println(queue);

        MyQueue<String> queue1 = new MyQueue<>();
        queue1.add("A");  queue1.add("B");  queue1.add("C");  queue1.add("D");
        System.out.println(queue1);

        System.out.println("Return first element from queue: " + queue1.peek());
        System.out.println("Remove first element from queue: " + queue1.poll());
        System.out.println(queue1);
        System.out.print("Clear queue: ");
        queue1.clear();
        System.out.println(queue1);

        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.peek();
        queue2.poll();
        queue2.size();

        System.out.println("***********************MyStack***********************");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
        System.out.println("Remove by index from stack: ");
        stack.remove(1);
        System.out.println(stack);
        System.out.println("Get first element from stack: " + stack.peek());

        System.out.println("Remove by index from stack: ");
        stack.remove(0);
        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println("Get first element and remove from stack: " + stack.pop());
        System.out.println(stack);

        System.out.println("Size: " + stack.size());
        System.out.println("Clear " + Arrays.toString(stack.clear()));

        MyStack<String> stack1 = new MyStack<>();
        stack1.push("A");
        stack1.push("B");
        stack1.push("D");
        stack1.push("C");

        System.out.println("Remove by index from stack: ");
        stack1.remove(1);
        System.out.println(stack1);
        System.out.println("Get first element from stack: " + stack1.peek());
        System.out.println("Clear " + Arrays.toString(stack.clear()));
    }
}