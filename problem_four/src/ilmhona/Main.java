package ilmhona;

public class Main {

    public static void main(String[] args) {

        String st = "abcdell";

        if (st.length() > 10) {
            System.out.println(st.substring(0, 6));
        } else {
            for (int i = st.length(); i < 12; i++) {
                st += '0';
            }
        }
        System.out.println(st);

    }
}
