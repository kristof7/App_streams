package com.example.app.brbw;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("file.txt"));
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        }finally {
         if(br != null)
            br.close();

        }
    }
}
