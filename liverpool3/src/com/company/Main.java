package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int doWhile = 1;
        do {
            if (doWhile <= 5 || doWhile <= 6) {
                doWhile++;
                continue;}
           System.out.println(doWhile+ " ");
           doWhile++;
          }while (doWhile<10);
           }

}
