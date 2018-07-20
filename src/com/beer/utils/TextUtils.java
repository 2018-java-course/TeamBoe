package com.beer.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author PC17
 */
public class TextUtils {

    private static TextUtils instance = new TextUtils();
    private Scanner sc = new Scanner(System.in);

    //singleton pattern
    private TextUtils() {
    }

    public static TextUtils getInstance() {
        return instance;
    }

    public String readString() {
        String s = "";
        System.out.print("> ");
        s = sc.nextLine();
        for (; s.length() < 2;) {
            System.out.println("Input not valid!!");
            System.out.print("> ");
            s = sc.nextLine();
        }
        return s;
    }

    public int readInt() {
        String text = "";
        int num = 0;
        System.out.print("> ");
        text = sc.nextLine();

        //asks input until it gets a valid int
        for (; !text.matches("[0-9]+");) {
            System.out.println("Number not valid!");
            System.out.print("> ");
            text = sc.nextLine();
        }
        num = Integer.parseInt(text);
        return num;

    }

    public LocalDate readDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = "";
        System.out.println("(valid date ex. d-m-y)");
        date = readString();
        LocalDate myDate = LocalDate.parse(date, dtf);
        return myDate;
    }

}
