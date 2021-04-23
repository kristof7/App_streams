package com.example.app.brbw;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            br = new BufferedReader(new FileReader("file.txt"));
            bw = new BufferedWriter(new FileWriter("bwFile.txt"));
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s);
            }

        }finally {
         if(br != null)
            br.close();
         if(bw != null)
             bw.close();
        }
    }
}
