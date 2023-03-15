package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog7TempValueDegreeFahrenheit {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Value");
        a = scan.nextInt();

        //calculate fahrenheit to celsius
        System.out.println("Celsius is: " + (a-32)*5/9);
        scan.close();


    }


}