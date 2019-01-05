package com.halove.testdesignpattern.singleton;

public class Singleton {
    private static Singleton mInstance = null;
    private static String s = "2";


    public static Singleton getInstanceFromHolder(){
        return SingletonHolder.mOnlyInstance;
    }

    private static class SingletonHolder{
        private static final Singleton mOnlyInstance = new Singleton();

    }
}
