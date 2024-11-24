package com.om.za.kata.interfaces;
import java.io.*;

public class Name {
    public interface displayName
    {
        void  displayDetails();
        String getName();
    }

    public static class displayN implements displayName
    {
        @Override
        public void displayDetails()
        {
            System.out.println("Hello World Interface Outside Class");
        }

        @Override
        public String getName()
        {
//            String name;
            return System.console().readLine();
//            return name;
        }

    }
}
