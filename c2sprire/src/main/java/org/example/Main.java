package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args)throws Exception {
        System.out.println("Hello world!");

        String language=args[0];

        InputStream resourceStream = Main.class.getClassLoader
                ().getResourceAsStream(language + ".txt");
        assert resourceStream != null;
        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader
                (resourceStream, StandardCharsets.UTF_8));
        System.out.println(bufferedInputStream.readLine());



    }
}