package com.company;

import com.sun.tools.javac.processing.JavacMessager;
import javafx.scene.shape.Path;
import sun.security.util.Length;
import sun.util.calendar.LocalGregorianCalendar;

import java.io.Console;
import java.lang.reflect.GenericArrayType;
import java.nio.file.Paths;
import  java.util.*;
public class Welcome {

    public static void main(String[] args) {
	// write your code here

        if (args[0].equals(("-g")))
        System.out.print("hello");
        else if (args[0].equals("-h"))
        System.out.print("Goodbye");
        for(int i = 1;i < args.length; i++)
            System.out.print(" "+args[i]);
            System.out.print("!");
        System.out.print("!");


    }
}
