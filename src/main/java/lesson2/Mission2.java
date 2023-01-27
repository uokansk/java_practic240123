package lesson2;

public class Mission2 {
    public static void main(String[] args) {
        stringCompression();
    }

    private static void stringCompression() {
        String giv = "aaabbbsddddd";
        StringBuilder sb = new StringBuilder(giv);
        StringBuilder rez = new StringBuilder();

        int count = 1;
        int i;
        for (i = 1; i < sb.length(); i++) {

            if (sb.charAt(i - 1) == sb.charAt(i)) {
                count++;
            }

            else {
                rez.append(sb.charAt(i - 1));
                rez.append(count);
                count = 1;
            }
        }
        rez.append(sb.charAt(i-1));
        rez.append(count);
        System.out.println(rez);
    }
}
