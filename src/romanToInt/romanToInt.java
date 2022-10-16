package romanToInt;

public class romanToInt {
    /**
     * 13. Roman to Integer
     * If current value > next value => total += current value
     * Else total = total - current value
     *
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            // Get int value from roman
            int s1 = getValue(s.charAt(i));
            // Check if last character
            if (i + 1 < s.length()) {
                // Get next value
                int s2 = getValue(s.charAt(i + 1));
                if (s1 >= s2) {
                    total += s1;
                } else {
                    total -= s1;
                }
            } else {
                total += s1;
            }
        }
        return total;
    }

    private static int getValue(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
