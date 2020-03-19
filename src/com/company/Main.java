package com.company;

class A{
    private int val;

    public A(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }
}

public class Main {

    public static void main(String[] args) {
        A x = new A(2);
        System.out.println(x.getVal());
    }
}
