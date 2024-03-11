package org.example.lab1.zadanie3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class zadanie3Test {
    private zadanie3 stos;
    @BeforeEach
    public void setUp() {
        stos = new zadanie3();
    }
    @Test
    void testPushAndPop() throws StackEmptyException {
        stos.push("element1");
        stos.push("element2");
        assertEquals("element2", stos.pop());
        assertEquals("element1", stos.pop());
    }



    @Test
    void testTopWithoutRemoval() throws StackEmptyException {
        stos.push("element1");
        stos.push("element2");
        assertEquals("element2", stos.top());
        assertFalse(stos.isEmpty());
    }

    @Test
    void testTopIsEmpty() {
        assertThrows(StackEmptyException.class, ()-> stos.top());
    }

    @Test
    void testIsEmpty(){
        assertTrue(stos.isEmpty());
        stos.push("apple");
        assertFalse(stos.isEmpty());
    }


}