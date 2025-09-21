public class StringManipulation {
    public static void main(String args[]) {
        String text = "Adventure";

        // Check the length using length() and print the length
        System.out.println("Length of string is: " + text.length());

        // Get the character at position 3 and print the character
        System.out.println("Character at position 3: " + text.charAt(2));

        // Get a part of the String from position 1 to 4 and print the string
        System.out.println("Substring from positions 1 to 4: " + text.substring(0,3));

        String anotherText= "Adventure";
        // Compare text with anotherText using equals() and print the output
        boolean comparison = text.equals(anotherText);
        if (comparison){
            System.out.println("They are euqual!");
        }
        else {
            System.out.println("They are not equal!");
        }

        // Change to uppercase using toUpperCase() and print the converted string
        System.out.println(text.toUpperCase());
        
        // Change to lowercase using toLowerCase() and print the converted string
        System.out.println(text.toLowerCase());

        // Check if it contains "vent" using contains() and print the output
        boolean check = text.contains("vent");
        if (check){
            System.out.println("Yes it contains 'vent'.");
        }
        else {
            System.out.println("No, it does not contain that.");
        }

        // Replace 'e' with 'a' and print the output
        String replaceEwithA = text.replace('e', 'a');
        System.out.println("String after we replaced e with a: " + replaceEwithA);

        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        String userName = firstName + lastName;
        System.out.println("Username: " + userName);

        String newEmail = email.replace("example", "email");
        System.out.println("New email: " + newEmail);

        int indexOfAtRate = email.indexOf("@");
        System.out.println("Index of '@' in email: " + indexOfAtRate);

    }

}
