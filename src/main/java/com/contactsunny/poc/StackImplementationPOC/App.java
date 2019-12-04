package com.contactsunny.poc.StackImplementationPOC;

import com.contactsunny.poc.StackImplementationPOC.exceptions.StackEmptyException;

import java.util.List;

public class App {

    public static void main(String[] args) {

        stringStackExample();

        integerStackExample();

    }

    private static void integerStackExample() {

        System.out.println("Integer stack demo");

        try {
            StackImpl<Integer> stack = new StackImpl<Integer>();

            stack.push(100);
            stack.push(200);

            Integer value = stack.pop();
            System.out.println("Popped value: " + value);

            stack.push(300);

            List<Integer> completeStack = stack.getStackAndEmpty();

            System.out.println("Complete stack: " + completeStack);

            stack.push(100);
            stack.push(200);

            long stackSize = stack.size();
            System.out.println("Stack size before flush: " + stackSize);

            stack.flush();

            stackSize = stack.size();
            System.out.println("Stack size after flush: " + stackSize);

            Integer lastValue = stack.pop();

        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("--------------------------------------------------------------");
    }

    private static void stringStackExample() {

        System.out.println("String stack demo");

        try {
            StackImpl<String> stack = new StackImpl<String>();

            stack.push("First");
            stack.push("Second");

            String value = stack.pop();
            System.out.println("Popped value: " + value);

            stack.push("Third");

            List<String> completeStack = stack.getStackAndEmpty();

            System.out.println("Complete stack: " + completeStack);

            stack.push("First");
            stack.push("Second");

            long stackSize = stack.size();
            System.out.println("Stack size before flush: " + stackSize);

            stack.flush();

            stackSize = stack.size();
            System.out.println("Stack size after flush: " + stackSize);

            String lastValue = stack.pop();

        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("--------------------------------------------------------------");
    }
}
