package com.example.app.olsoos;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

//        String s = "Sample text";

        Person person = new Person("Steve", "Johns", 25);

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;



        try{
            // in this lines we save our object
            oos = new ObjectOutputStream(new FileOutputStream("oosFile.txt"));
//            oos.writeObject(s);
            oos.writeObject(person);

            // in this lines we read our object
            ois = new ObjectInputStream(new FileInputStream("oosFile.txt"));
//            String text = (String)ois.readObject();
//            System.out.println(text);

            Person p = (Person) ois.readObject();
            System.out.println(p);


        }finally {
            if (oos != null)
                oos.close();
            if (ois != null)
                ois.close();
        }

    }
}
