package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {
        System.out.println("Program, ktory pobiera od uzytkownika liczbe calkowita n dodatnia,");
        System.out.println("a nastepnie wyswietla na ekranie kolejno potêgi liczby 2,.");
        System.out.println("ale nie wieksze niz podana liczba n.");
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbe.");
        int a = liczba.nextInt();
        for (int i = 2; i <= a; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Koniec programu.");
    }
}