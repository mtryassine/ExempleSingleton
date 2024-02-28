package org.example;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        s1.faireQQC1();



        if (s1 == s2)
        {
            System.out.println("meme instance");
        }

    }
}