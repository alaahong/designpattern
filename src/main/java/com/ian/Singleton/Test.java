package com.ian.Singleton;

import java.io.*;

/**
 * Created by Ian on 09/06/2015.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DoubleCheckSingleton s = DoubleCheckSingleton.getInstance();

        FileOutputStream out = new FileOutputStream("C:\\Work\\1.o");
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(s);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Work\\1.o"));
        DoubleCheckSingleton s2 =  (DoubleCheckSingleton)ois.readObject();
        System.out.println(s == s2);
        System.out.println(s.equals(s2));


        EnumSingleton singleton =   EnumSingleton.SINGLETON;
        FileOutputStream out2 = new FileOutputStream("C:\\Work\\1.o");
        ObjectOutputStream oos2 = new ObjectOutputStream(out2);
        oos2.writeObject(singleton);

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("C:\\Work\\1.o"));
        EnumSingleton singleton2 = (EnumSingleton)ois2.readObject();
        System.out.println(singleton == singleton2);
        System.out.println(singleton.equals(singleton2));
    }

}
