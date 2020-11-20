package ilmhona;

public class Main {

    public static void main(String[] args) {

        String st = "My word is word and word";
        String[] st1 = {};

        st1 = st.split(" ");

        for (int i = 0; i < st1.length; i++) {
            if (st1[i].equals("word")) {
                st1[i] = "letter";
            }
        }

        st = String.join(" ", st1);
        System.out.println(st);
    }
}
