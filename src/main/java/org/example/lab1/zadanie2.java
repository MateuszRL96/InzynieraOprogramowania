package org.example.lab1;

public class zadanie2 {

    public int[] sortuj(int tab[]){
        int min, i, j, temp;
        for (i = 0; i < tab.length - 1; i++){
            min=i;
            for (j=i+1; j < tab.length; j++){
                if(tab[j]<tab[min]) {
                    min=j;
                }
            }
            if(min != i){
                temp=tab[min];
                tab[min]=tab[i];
                tab[i]=temp;
            }
        }
        return tab;
    }

}
