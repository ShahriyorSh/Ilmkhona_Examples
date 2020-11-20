package com.company;

public class Main {

    public static void main(String[] args) {

        String st = "Tajikistan";
//        String st2 = "Sony";
        StringBuilder s = new StringBuilder();

        if (st.length() > 5) {
            System.out.print(st.substring(0, 3) + " ");
            System.out.print(st.substring(st.length() - 3));
        } else {
            for (int i = 0; i < st.length(); i++) {
                s.append(st.charAt(0));
            }
        }
        System.out.println( s);
    }

}
