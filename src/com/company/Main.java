package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
    int testCases = Integer.parseInt(scanner.nextLine());

    while (testCases > 0) {
        String line = scanner.nextLine();
        String regex = "<(.+)>([^<>]+)(</\\1>)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(line);
        int counter = 0;

        while (m.find()) {
            if (m.group(2).length() != 0) {
                System.out.println(m.group(2));
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("None");
        }

        testCases--;

    }
    scanner.close();

    }
}
