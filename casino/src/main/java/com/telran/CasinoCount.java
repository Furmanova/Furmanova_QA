package com.telran;



public class CasinoCount {
    public  static int countMinimumNumberOfMoves(int n,int m) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0 && m > 0) {
                n /= 2;
                m--;
            } else {
                n--;
            }
            count++;
        }
        return count;
    }


}
