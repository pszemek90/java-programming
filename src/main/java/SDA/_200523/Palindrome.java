package SDA._200523;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String word = scanner.nextLine();
        word = word.replaceAll(" ","");
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        sb.reverse();
        String reversedWord = sb.toString();
        if(word.equals(reversedWord))
            System.out.println("Palindrom");
        else
            System.out.println("Nie palindrom");
    }
}
