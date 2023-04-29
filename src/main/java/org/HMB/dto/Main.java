package org.HMB.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    private static final String FILE_NAME = "./src/main/resources/user.json";

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
        FileReader fileReader;
        try {
            fileReader = new FileReader(FILE_NAME);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        UserDto dto = gson.fromJson(fileReader, UserDto.class);
        System.out.println("------------");
        System.out.println(dto.toString());
    }
}