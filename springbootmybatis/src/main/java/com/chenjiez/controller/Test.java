package com.chenjiez.controller;


import java.io.PrintStream;

/**
 * Created by zcj on 2017/2/10.
 */
public class Test {
    public static void main(String[] args){
        int a=10;
        int b=10;
        method(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
   static void method(int a, int b){
       PrintStream myStream=new PrintStream(System.out){

           public void println(String x){
               if (x.startsWith("a"))
                   super.println(x+"0");
               if(x.startsWith("b"))
                   super.println("b="+200);
           }
       };
      System.setOut(myStream);
   }
}
