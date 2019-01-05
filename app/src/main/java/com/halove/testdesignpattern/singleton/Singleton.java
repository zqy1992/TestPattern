package com.halove.testdesignpattern.singleton;

public class Singleton {
    private static Singleton mInstance = null;
    private static String s = "2";
    private static String s3 = "23";


    public static Singleton getInstanceFromHolder(){
        return SingletonHolder.mOnlyInstance;
    }

    private static class SingletonHolder{
        private static final Singleton mOnlyInstance = new Singleton();

    }
}
