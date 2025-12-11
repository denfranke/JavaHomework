package Module_1.Homework_5;

public class Main {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length(); i++) {
            for (int j = 0; j < PATTERN.length(); j++) {
                if (i + j < TEXT.length() && TEXT.charAt(i + j) != PATTERN.charAt(j))
                    break;
                else if (j == PATTERN.length() -1)
                    count++;
            }
        }

        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}
