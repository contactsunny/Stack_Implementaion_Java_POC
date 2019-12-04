package com.contactsunny.poc.StackImplementationPOC;

import com.contactsunny.poc.StackImplementationPOC.exceptions.StackEmptyException;

import java.util.ArrayList;
import java.util.List;

class StackImpl<T> {

    // Creating a private array list of the generic T class.
    private List<T> list = new ArrayList<T>();

    public long size() {
        return this.list.size();
    }

    void push(T value) {
        list.add(value);
    }

    T pop() throws StackEmptyException {

        // Throwing an exception if the list is empty.
        if (this.list.isEmpty()) {
            throw new StackEmptyException("The stack is empty. Push a value before popping it.");
        }

        // Getting the last value from the list.
        T value = this.list.get(this.list.size() - 1);

        // Removing the last value from the list, thereby popping the last value.
        this.list.remove(this.list.size() - 1);

        return value;
    }

    List<T> getStackAndEmpty() {
        List<T> stack = new ArrayList<T>(this.list);

        this.list.removeAll(stack);

        return stack;
    }

    void flush() {
        this.list = new ArrayList<>();
    }
}
