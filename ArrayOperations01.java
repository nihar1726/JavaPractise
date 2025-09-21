public class ArrayOperations01 {
    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        for (String hero : superheroes) {
            System.out.println(hero);
        }

        // Print the years of introduction
        System.out.println("\nYears of Introduction:");
        for (int year : introductionYears) {
            System.out.println(year);
        }
    }
}
