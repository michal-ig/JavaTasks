package com.interview.tasks;

public interface WordCounter {

    /**
     * Counts the occurrences of a specific word within a given sample string.
     * <p>
     * For example, given the sample string "This test testtest testest estesttest"
     * and the word "test", the method will return the number of times "test" appears
     * in the sample string.
     * <p>
     * Example usage:
     * <pre>
     * {@code
     * String sampleString = "This test testtest testest estesttest";
     * String word = "test";
     * int count = countWordInString(sampleString, word);
     * }
     * </pre>
     * <p>
     * Tip: You may consider treating the string as a char array for some implementations:
     * <pre>
     * {@code
     * char[] textChar = sampleString.toCharArray();
     * }
     * </pre>
     *
     * @param sampleString the string in which to search for the word
     * @param word         the word to count within the sample string
     * @return the number of occurrences of the specified word in the sample string
     * @throws IllegalArgumentException if the sample string or word is null or empty
     */
    int getWordCountInString(String sampleString, String word);
}
