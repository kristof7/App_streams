package com.example.app;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = null;

        try{
            fis = new FileInputStream("File.txt");

        }finally {
         if(fis != null)
            fis.close();
        }

    }
}
