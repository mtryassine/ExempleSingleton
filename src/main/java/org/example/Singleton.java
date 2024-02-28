package org.example;

public class Singleton implements Moninterface1, Moninterface2{

    private static Singleton instance = null;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    @Override
    public void faireQQC1() {

    }

    @Override
    public void faireQQC2() {

    }
}
