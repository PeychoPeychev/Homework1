package programming.homework1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter your hobby:");
        String hobby =scanner.next();
        System.out.println(name + " has a hobby " + hobby);
        }
    }


