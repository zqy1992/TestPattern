package com.halove.testdesignpattern.chain;

public class TwoHandler extends Handler {
    @Override
    public void deal(String name, double fee) {
        if(fee<500){
            System.out.println("two同意了");
        }else {
            System.out.println("申请上级领导批示");
            if(getNextHandler()!=null){
               getNextHandler().deal(name,fee);
            }

        }
    }
}
