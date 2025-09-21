public class StringOperations03 {
    public static void main(String[] args) {
        String sentence = "Java programming is fun and educational.";
        System.out.println("Original sentence: " + sentence);

        String wordToFind = "fun";
        if (sentence.contains(wordToFind)) {
            System.out.println("The sentence contains the word: " + wordToFind);
        } else {
            System.out.println("The sentence does not contain the word: " + wordToFind);
        }

        String newSentence = sentence.replace("educational", "awesome");
        System.out.println("Modified sentence: " + newSentence);

        int SentenceLength = sentence.length();
        System.out.println("Length of the sentence: " + SentenceLength);

        int maxLength = 17;
        if (sentence.length() > maxLength) {
            String shortSentence = sentence.substring(0, maxLength);
            System.out.println("Shortened sentence (Length 17): " + shortSentence);
        }
    }
}
