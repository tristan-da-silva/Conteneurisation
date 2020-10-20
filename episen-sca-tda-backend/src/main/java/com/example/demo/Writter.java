package com.example.demo;

import com.example.demo.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Writter {


    public static void add_order(User user){
        String userName = user.getName();
        userName +=System.lineSeparator();
        try {
            try {
                Files.write(Paths.get("orders.txt"), userName.getBytes(), StandardOpenOption.APPEND);
            } catch (NoSuchFileException nf) {
                FileWriter fileWriter = new FileWriter("orders.txt");
                fileWriter.write(userName);
                fileWriter.close();
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
