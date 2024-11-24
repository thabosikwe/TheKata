package com.om.za.kata.interfaces;

public class Destination {
    String destChars = "";

    public String getDestChars()
    {
        return destChars;
    }
    public void setDestChars(String newDestChars)
    {
        this.destChars = destChars;
    }

    public interface IDestination
    {
        void WriteChar(char c);
        void WriteChars(char[] values);
    }

    public void WriteChar(char c)
    {
        this.destChars = this.destChars.concat(String.valueOf(c));
    }

    public void WriteChars(char[] newvalues)
    {
        for (char newvalue : newvalues) {
            this.destChars = this.destChars.concat(String.valueOf(newvalue));
        }
    }
}
