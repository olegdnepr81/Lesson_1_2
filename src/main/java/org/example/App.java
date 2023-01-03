package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectsMapper = new ObjectMapper();
        System.out.println(objectsMapper.writeValueAsString(new Person("Oleh", "Pysarenko")));
    }
}