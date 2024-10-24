package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> charSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(3 == lengthOfLongestSubstring(s1));

        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(1 == lengthOfLongestSubstring(s2));

        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(3 == lengthOfLongestSubstring(s3));
    }
}