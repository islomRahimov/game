package com.company;


public class Math implements Test{
    String name;
    int ball;
    int res;

    @Override
    public void test(int a,int b,int c){

        switch (c){
            case 0->{
                res = a+b;
                System.out.print(a+" + "+b+" = ");
            }
            case 1->{
                res = a-b;
                System.out.print(a+" - "+b+" = ");
            }
            case 3->{
                res = a*b;
                System.out.print(a+" * "+b+" = ");
            }
            case 4->{
                res = a+b;
                System.out.print(a+" / "+b+" = ");
            }
        }
    }



}
