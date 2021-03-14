package com.company;

import java.util.Scanner;

public class ReverseText {

    String abc = "abc";
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();


    public void reverseTextMethod() {
        char[] letterTable = text.toCharArray();
        for (int i = text.length()-1; i >= 0; i--) {

            System.out.print(letterTable[i]);

        }
    }

}
