package com.example.demo;

import com.example.demo.model.User;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Writter {

    final static Logger logger = Logger.getLogger(Writter.class);


    public static void add_order(User user){
        String userName = user.getName();
        userName +=System.lineSeparator();

        try {
            try {
                Files.write(Paths.get("orders.txt"), userName.getBytes(), StandardOpenOption.APPEND);
                logger.info("An user was added!");
            } catch (NoSuchFileException nf) {
                FileWriter fileWriter = new FileWriter("orders.txt");
                fileWriter.write(userName);
                fileWriter.close();
                logger.info("An user was added!");
            }
        } catch (IOException io) {
            io.printStackTrace();
            logger.error("Sorry, something wrong!");
        }

    }
}
