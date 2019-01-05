package com.halove.testdesignpattern.chain;

public class ThreeHandler extends Handler {
    @Override
    public void deal(String name, double fee) {
        if(fee<800){
            System.out.println("three同意了");
        }else {
            System.out.println("审核不通过啦~~~");


        }
    }
}
