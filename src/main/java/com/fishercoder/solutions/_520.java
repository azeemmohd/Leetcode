package com.fishercoder.solutions;

/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.
 Example 1:
 Input: "USA"
 Output: True
 Example 2:
 Input: "FlaG"
 Output: False
 Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

 */
public class _520 {
    public boolean detectCapitalUse(String word) {
        char[] words = word.toCharArray();
        boolean firstLetterCap = false;
        if (Character.isUpperCase(words[0])) {
            firstLetterCap = true;
        }

        if (firstLetterCap) {
            if (words.length >= 2) {
                int i = 2;
                if (Character.isUpperCase(words[1])) {
                    //then all following must be all uppercase
                    while (i < words.length) {
                        if (!Character.isUpperCase(words[i])) {
                            return false;
                        }
                        i++;
                    }
                    return true;
                } else {
                    //then all following must be all lowercase
                    while (i < words.length) {
                        if (!Character.isLowerCase(words[i])) {
                            return false;
                        }
                        i++;
                    }
                    return true;
                }
            }
            return true;
        } else {
            //then all following must be all lowercase
            int i = 1;
            while (i < words.length) {
                if (!Character.isLowerCase(words[i])) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
