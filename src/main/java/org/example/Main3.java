package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class Main3 {
    public void Write {
        JSONObject employeeDetails = new JSONObject();
        Employee employee= new Employee();
        employeeDetails.("");
        employee.SetName("Ana");
        objectMapper.writeValue(new File("C:\\Users\\rares\\IdeaProjects\\untitled3\\muncitori.txt"), employee);
    }
}
