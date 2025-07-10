package ex_30_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task_HandleChecked_Exception_Using_TryCatch {
    public static void main(String[] args) {
        /*📘 Description:
        Open a file using FileReader and handle FileNotFoundException using try-catch */

        try {
            FileReader reader = new FileReader("sample.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println("Execution continued after file handling.");
    }
 }

