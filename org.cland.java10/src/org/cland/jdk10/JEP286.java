package org.cland.jdk10;

import java.util.ArrayList;

/**
 * REF: https://openjdk.java.net/jeps/286
 * */
public class JEP286 {

    public static void main(String[] args){
        var str="haha";
        var lst=new ArrayList<String>();
        lst.add("lst1");
        System.out.println(str);
        System.out.println(lst.get(0));
    }
}
