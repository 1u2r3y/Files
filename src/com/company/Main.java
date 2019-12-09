package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static Scanner scan;
    private static PrintWriter pw;
    public static int k;
    public static void main(String[] args) {
        File file = new File("C:/test/test465.txt");
        try {
            boolean flag = file.createNewFile();
            pw = new PrintWriter(new FileWriter(file));
            pw.write("Test and You");

        } catch (IOException e) {
            System.out.println("Что-то случилось:"+e.toString());
        } finally {
            pw.close();
        }

        try {
            scan = new Scanner(file);
            while (scan.hasNext()) {
                k++;
                System.out.print(scan.next()+" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
        System.out.println(k);
    }
}
