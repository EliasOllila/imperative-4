package com.company;
public class Main {

    public static void main(String[] args) {
        int T=22;
        String action;
        if(T<17)
            action="hit";
        else if(T<=21)
            action="stay";
        else
            action="bust";
        System.out.println(action);



    }
}
