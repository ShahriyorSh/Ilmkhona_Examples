package olmhona;

public class Main {

    public static void main(String[] args) {

        String st = "abcdewfjhqz";

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'w') {
                System.out.println("Раньше w");
                return;
            } else if (st.charAt(i) == 'x') {
                System.out.println("Раньше x");
                return;
            }
        }
        System.out.println("нет w и x");
    }
}
