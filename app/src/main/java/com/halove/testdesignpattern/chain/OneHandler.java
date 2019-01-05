package com.halove.testdesignpattern.chain;

public class OneHandler extends Handler {
    @Override
    public void deal(String name, double fee) {
        if(fee<300){
            System.out.println("one同意了");
        }else {
            System.out.println("申请上级领导批示");
            if(getNextHandler()!=null){
               getNextHandler().deal(name,fee);
            }

        }
    }
}
