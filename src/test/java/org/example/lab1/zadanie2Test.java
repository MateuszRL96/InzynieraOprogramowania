package org.example.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class zadanie2Test {

    private zadanie2 sortowanie = new zadanie2();

    @Test
    public void testSprawdzCzySortuje(){
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortowanie.sortuj(new int[]{2, 1, 3, 4, 5}));
    }

    @Test
    public void testSprawdzCzyPosortujePodobneElementy(){
        assertArrayEquals(new int[]{1, 2, 3, 3, 3, 4, 5}, sortowanie.sortuj(new int[]{3, 3, 1, 2, 3, 4, 5}));
    }

    @Test
    public void testPustaTablica(){
        assertArrayEquals(new int[]{}, sortowanie.sortuj(new int[]{}));

    }

    @Test
    public void testJedenElement(){
        assertArrayEquals(new int[]{1}, sortowanie.sortuj(new int[]{1}));
    }

    @Test
    public void testSortujPosortowanaTablica(){
        assertArrayEquals(new int[]{1, 2, 3}, sortowanie.sortuj(new int[]{1, 2, 3}));
    }

    @Test
    public void testSortujLiczbyUjemne(){
        assertArrayEquals(new int[]{-5, -4, -3, 0, 1, 3, 5}, sortowanie.sortuj(new int[]{0, 1, 3, 5, -3, -4, -5}));
    }

}