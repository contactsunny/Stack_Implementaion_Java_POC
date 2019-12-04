package com.contactsunny.poc.StackImplementationPOC;

import com.contactsunny.poc.StackImplementationPOC.exceptions.StackEmptyException;

import java.util.List;

public class App {

    public static void main(String[] args) {

        stringStackExample();

        integerStackExample();

    }

    private static void integerStackExample() {

        try {
            StackImpl<Integer> stack = new StackImpl<Integer>();

            stack.push(100);
            stack.push(200);

            Integer value = stack.pop();
            System.out.println("Popped value: " + value);

            stack.push(300);

            long stackSize = stack.size();

            System.out.println("Stack size: " + stackSize);

            List<Integer> completeStack = stack.getStackAndEmpty();

            System.out.println("Complete stack: " + completeStack);

            Integer lastValue = stack.pop();

        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void stringStackExample() {

        try {
            StackImpl<String> stack = new StackImpl<String>();

            stack.push("First");
            stack.push("Second");

            String value = stack.pop();
            System.out.println("Popped value: " + value);

            stack.push("Third");

            long stackSize = stack.size();

            System.out.println("Stack size: " + stackSize);

            List<String> completeStack = stack.getStackAndEmpty();

            System.out.println("Complete stack: " + completeStack);

            String lastValue = stack.pop();

        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
