package org.example.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class zadanie1Test {
    @Test
    public void testZnajdzIstniejacyElement() {
        zadanie1 szukaj = new zadanie1();
        int[] tablica = {1, 2, 3, 4, 5};
        int wynik = szukaj.szuk(tablica, 3);
        assertEquals(2, wynik, "Element 3 powinien być na pozycji 2");
    }

    @Test
    public void testZnajdzNieIstniejacyElement(){
        zadanie1 szukaj = new zadanie1();
        int[] tablica = {1, 2, 3, 4, 5};
        int wynik = szukaj.szuk(tablica, 6);
        assertEquals(0, wynik, "Nie istnieje taki element w tablicy");
    }

    @Test
    public void testZnajdzElementWPustejTablicy(){
        zadanie1 szukaj = new zadanie1();
        int[] tablica = {};
        int wynik = szukaj.szuk(tablica, 1);
        assertEquals(0, wynik, "Pusta tablica powinna zwrocic 0");
    }

    @Test
    public void testZnajdzPierwszeWystapienieElementu(){
        zadanie1 szukaj = new zadanie1();
        int[] tablica = {1, 2, 3, 4, 3, 5, 6};
        int wynik = szukaj.szuk(tablica, 3);
        assertEquals(2, wynik, "Pierwsze wystapienie elementu 3 powinno byc na pozycji 2");
    }

    @Test
    public void testSprawdzCzyOstatniElementSieZgadza(){
        zadanie1 szukaj = new zadanie1();
        int[] tablica = {1, 2, 3, 4, 5, 6};
        int wynik = szukaj.szuk(tablica, 6);
        assertEquals(5, wynik, "Powinno wyswietlic 5 jako ostatni element tablicy");
    }




}