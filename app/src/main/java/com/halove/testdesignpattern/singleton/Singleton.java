package com.halove.testdesignpattern.singleton;

public class Singleton {
    private static Singleton mInstance = null;
    private static String s = "2";
    private static String s3 = "23";
    private static String s4 = "234";
    private static String s45 = "234";
    private static String s46 = "234";
    private static String s47= "234";
    private static String s48 = "234";
    private static String s489 = "234";
    private static String s4810 = "234";
    private static String s48102= "234";
    private static String s48101 = "234";
    private static String s481501 = "234";


    public static Singleton getInstanceFromHolder(){
        return SingletonHolder.mOnlyInstance;
    }

    private static class SingletonHolder{
        private static final Singleton mOnlyInstance = new Singleton();

    }
}
