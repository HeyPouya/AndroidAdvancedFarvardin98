package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old;

public class TestJava {


    String s = "Pouya";

    int a = 120;

    float f = 17.170f;


    //return type : void
    public void testFunction() {

//        TestKotlin k = new TestKotlin();


    }


    //return type : int
    public int testFunction2() {
        return 10;
    }


    //int
    //float
    //double
    //boolean
    //char
    //long
    //short


    //String
    //Date


    public String likePicture(String id)  {
        if (id != null)
            return id;
        else
            throw new IllegalStateException("Something happened!");
    }
}
