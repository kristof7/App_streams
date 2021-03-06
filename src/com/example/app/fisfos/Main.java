package com.example.app.fisfos;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("File.txt");

            fos = new FileOutputStream("fosFile.txt");

            int c;

            while((c = fis.read()) != -1) {
                System.out.print((char)c);
                fos.write(c);
            }


        }finally {
         if(fis != null)
            fis.close();
         if(fos != null)
             fos.close();
        }

    }
}
