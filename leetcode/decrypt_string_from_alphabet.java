package leetcode;
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
public class decrypt_string_from_alphabet {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (i + 2 < n && s.charAt(i + 2) == '#') {

                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) (num + 96));
                i += 3;
            } else {

                result.append((char) (s.charAt(i) - '0' + 96));
                i++;
            }
        }

        return result.toString();
    }
}
