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
    private static String v21 = "234";
    private static String s48150541 = "234";
    private static String s48451501 = "234";
    private static String s4845150fdgfd1 = "234";
    private static String s48451dfgfd501 = "234";
    private static String v18 = "234";
    private static String v19 = "2341";


    public static Singleton getInstanceFromHolder(){
        return SingletonHolder.mOnlyInstance;
    }

    private static class SingletonHolder{
        private static final Singleton mOnlyInstance = new Singleton();

    }
}
