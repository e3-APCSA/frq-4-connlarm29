public class Question1 {
    public static void main(String[] args) {
        longestStreak("CCAAAAATTT!");
    }

    /*
     * The method longestStreak is intended to determine the longest substring of consecutive identical characters
     * in the parameter str and print the result.
     *
     * For example, the call longestStreak("CCAAAAATTT!") should print the result "A 5" because the longest substring
     * of consecutive identical characters is "AAAAA".
     */
    private static void longestStreak(String str) {
        int max = 1;
        String letter = "";

        for(int b = 0; b < str.length()-1; b++){
            int x = 1;
            while(str.charAt(b) == str.charAt(b+1)) {
                b++;
                x++;
            }
            if(x > max) {
                max = x;
                letter = "" + str.charAt(b);
            }
        }
        System.out.println(letter + " " + max);

    }
}
