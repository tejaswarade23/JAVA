package org.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    private String className = "";

    private String[] fields = new String[10];
    private String[] methods = new String[10];

    private int fieldCount = 0;
    private int methodCount = 0;

    public void setClassName(String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("Class name cannot be empty!");
        }
        className = name;
    }

    public void addField(String field) throws Exception {
        if (className.isEmpty()) {
            throw new Exception("Enter class name first!");
        }
        if (field.isEmpty()) {
            throw new Exception("Field cannot be empty!");
        }
        if (fieldCount >= 10) {
            throw new Exception("Field limit reached!");
        }

        fields[fieldCount++] = field;
    }

    public void addMethod(String method) throws Exception {
        if (className.isEmpty()) {
            throw new Exception("Enter class name first!");
        }
        if (method.trim().isEmpty()) {
            throw new Exception("Method cannot be empty!");
        }
        if (methodCount >= 10) {
            throw new Exception("Method limit reached!");
        }

        methods[methodCount++] = method;
    }

    public void generateClassFile() throws Exception {

        if (className.isEmpty()) {
            throw new Exception("Enter class name first!");
        }

        try {
            FileWriter writer = new FileWriter(className + ".java");

            writer.write("public class " + className + " {\n\n");

            for (int i = 0; i < fieldCount; i++) {
                writer.write("    " + fields[i] + "\n");
            }

            writer.write("\n");
            for (int i = 0; i < methodCount; i++) {
                writer.write("    " + methods[i] + "\n");
            }

            writer.write("}");

            writer.close();

            System.out.println("File created successfully: " + className + ".java");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}