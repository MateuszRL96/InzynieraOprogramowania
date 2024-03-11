package org.example.lab1.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class zadanie3  implements StackExercise {

    private List<String> stack;

    public zadanie3() {
        this.stack = new ArrayList<>();
    }

    @Override
    public String pop() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException("Stos jest pusty");
        }
        return stack.removeLast();
    }

    @Override
    public void push(String item) {
        stack.add(item);
    }

    @Override
    public String top() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException("Stos jest pusty");
        }
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
