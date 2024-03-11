package org.example.lab1;

public class zadanie1 {



    public int szuk(int []t, int k){
        for(int i=0; i<t.length-1; i++){
            if (t[i] == k) {
                System.out.println("Element "+k+" znajduje się na pozycji "+i);
                return i;
            }
        }
        return 0;
    }
    //pierwszy blad w kodzie to uzycie petli for z t.length-1 ktore nie lapie ostatniego elementu
    //drugi blad to return 0, ktore moze oznaczac ze jest zwracany element o 0 indeksie.
}
