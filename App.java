package com.mycompany.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        Texting t = new Texting(s);
        System.out.print("Enter an integer: ");
        int n = Integer.parseInt(in.nextLine());
        String rep = t.repeatString(n);
        System.out.println(rep);
    }
}

