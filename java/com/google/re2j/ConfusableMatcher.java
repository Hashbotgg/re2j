package com.google.re2j;

public interface ConfusableMatcher {

    /**
     * Function to check if two characters can be confused to each other
     * @param currentCodepoint codepoint of the character that you want to check
     * @param confusableCodepoint character that you think could be confused to the character
     * @return  true if the two characters can be confused to one another
     */
    boolean getConfusableCharacters(int currentCodepoint, int confusableCodepoint);
}
