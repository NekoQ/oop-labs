package com.company.lab4;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/com/company/lab4/expressions.txt";
        List<String> lines;
        Stack<Character> stack = new Stack<>();

        Path filePath = Paths.get(path);
        lines = Files.readAllLines(filePath);

        for (String line : lines) {
            boolean balanced = true;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                    balanced = false; break;
                }
                if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                    balanced = false; break;
                }
                if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                    balanced = false; break;
                }
            }
            if (stack.isEmpty() && balanced)
                System.out.println("BALANCED!");
            else
                System.out.println("NOT BALANCED, BALANCE IT !!!");

        }

    }
}
