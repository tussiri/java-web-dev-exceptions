package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(3, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            int points = CheckFileExtension(student.getValue());
            if (points == -1) {
                System.out.println(student.getKey() + " missing file.");
            } else if (points == 0) {
                System.out.println(student.getKey() + " did not submit correct file type.");
            }
        }
    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmaticException("Cannot divide by zero!");
            } catch (ArithmaticException e) {
                e.printStackTrace();
            }
        }
//        System.out.println(x / y);
    }

    public static int CheckFileExtension(String fileName) {
        int points = 0;
        if (fileName.endsWith(".java")) {
            return points + 1;
        } else if (fileName == null || fileName == "") {
            try {
                throw new ArithmaticException("You're missing a file extension.");
            } catch (ArithmaticException e) {
                e.printStackTrace();
            }
            return points-1;
            }
            return 0;
        }
    }
