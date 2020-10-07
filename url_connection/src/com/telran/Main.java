package com.telran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    static final String URL_ADDRESS = "http://www.google.com";

    public static void main(String[] args) throws IOException {
        URL url = new URL(URL_ADDRESS);
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
    }
}
