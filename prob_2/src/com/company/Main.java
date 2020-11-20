package com.company;

public class Main {

    public static void main(String[] args) {

        String st = "tajikistan p feel p the friendship";
        //System.out.println(st.substring(st.length() - 1));

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == st.charAt(st.length() - 1)) {
                System.out.println(i);
            }
        }
    }
}
