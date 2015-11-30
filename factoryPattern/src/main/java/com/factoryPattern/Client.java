package com.factoryPattern;

public class Client {
    public static void main(String args[]) {
        try {
            TVFactory factory = new HaierTVFactory();
            TV  tv = factory.produceTV();
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
