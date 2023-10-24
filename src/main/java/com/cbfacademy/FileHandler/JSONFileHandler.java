/*package main.java.com.cbfacademy.FileHandler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//import com.cbfacademy.Employee.Employee;


public class JSONFileHandler {

    //return a `List<Employee>` object, where each list item is an Employee object (the `Employee.java` class has been provided for you.)
public static List<String> readFile(String filename) {
    
   List<String> employees = new ArrayList<>();

    try {
    // create Gson instance
    Gson gson = new Gson();

    // create a reader
    Reader reader = Files.newBufferedReader(Paths.get(filename));

    // convert JSON array to list of users
   // List<Employee> employees = new Gson().fromJson(reader, new TypeToken<List<Employee>>() {}.getType());
   TypeToken<List<String>> listType = new TypeToken<List<String>>() {};
   
   employees = gson.fromJson(reader, listType.getType());
    // print users
   // employees.forEach(System.out::println);

    // close reader
    reader.close();

} catch (Exception ex) {
    ex.printStackTrace();
}
    return employees;
}

}
*/
package com.cbfacademy.FileHandler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.cbfacademy.Employee.Employee;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONFileHandler {

    public static List<Employee> readFile(String filename) {
        List<Employee> employees = new ArrayList<>();

        try {
            // Create Gson instance
            Gson gson = new Gson();

            // Create a reader for the specified JSON file
            Reader reader = Files.newBufferedReader(Paths.get(filename));

            // Convert JSON array to a list of Employee objects
            TypeToken<List<Employee>> listType = new TypeToken<List<Employee>>() {};

            employees = gson.fromJson(reader, listType.getType());

            // Close the reader
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return employees;
    }
}
