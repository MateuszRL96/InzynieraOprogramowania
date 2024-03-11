package org.example.lab1.zadanie3;

public interface StackExercise {
    String pop() throws StackEmptyException;
    void push(String item);
    String top() throws StackEmptyException;
    boolean isEmpty();

}
