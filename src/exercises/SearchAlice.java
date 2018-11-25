package exercises;

import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args) {
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        String[] words = passage.split("\\s+");
        String searchTerm;
        Scanner askTerm;
        boolean found = false;

        askTerm = new Scanner(System.in);
        System.out.println("What is your search term?");
        searchTerm = askTerm.next();

        for (String element:words) {
            if ( element.equals( searchTerm )) {
                found = true;
            }
        }
        if (found) {
            System.out.println( "The array contains the string: " + searchTerm );
        } else {
            System.out.println( "The array does not contains the string: " + searchTerm );
        }
    }

    }
