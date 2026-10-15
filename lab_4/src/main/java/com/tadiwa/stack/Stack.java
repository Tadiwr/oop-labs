package com.tadiwa.stack;

import java.util.ArrayList;

/**
 * The inheritence version of `Stack extends ArrayList` is wrong
 * because a stacks operations don't conform to those of a `List` object
 * because Stacks use LIFO for push and pop operations, whiles a `List`
 * makes use of indices instead
 * */

public class Stack<T> {
    private final ArrayList<T> arrayList = new ArrayList<>();

    public void push(T data) {
        arrayList.add(data);
    }

    public T pop() {

        if (arrayList.isEmpty()) {
            return null;
        }

        int lastIndex = arrayList.size() - 1;
        return arrayList.remove(lastIndex);
    }

    public static void main(String[] args) {
        Stack<String> stackOfBooks = new Stack<>();
        stackOfBooks.push("Harry Porter and the Goblet of Fire");
        stackOfBooks.push("Oliver Twist");
        stackOfBooks.push("Charlie and the Chocolate factory");

        System.out.println("Pop Operation returns: " + stackOfBooks.pop());
    }
}
