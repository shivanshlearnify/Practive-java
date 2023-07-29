// 5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

import java.util.*;

public class Q18 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int day = sc.nextInt();
      find(day);
    }

    public static void find(int day){
        switch(day){
            case 1 : System.out.println("sunday");
            break;
            case 2 : System.out.println("monday");
            break;
            case 3 : System.out.println("tuesday");
            break;
            case 4 : System.out.println("wednesday");
            break;
            case 5 : System.out.println("thrusday");
            break;
            case 6 : System.out.println("friday");
            break;
            case 7 : System.out.println("satarday");
            break;
            default : System.out.println("invalid data ");
        }
    }
}
