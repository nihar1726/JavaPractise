public class StringOperation02 {

    public static void main(String[] args) {

        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: " + titleLength);

        //Declare and initialise the length of shortened book title
        int maxLength = 20;
        
        if (bookTitle.length() > maxLength) {
            // Shortened the book title
            String shortBookTitle = bookTitle.substring(0, maxLength);
            System.out.println("Original title: " + bookTitle);
            System.out.println("Shortened title: " + shortBookTitle);
        }

        String searchWord = "Captain";
        if (bookTitle.contains(searchWord)) {
            System.out.println("The book title contains the word: " + searchWord);
        } else {
            System.out.println("The book title does not contain the word: " + searchWord);
        }
}
}
