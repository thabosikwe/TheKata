package com.om.za.kata.interfaces;

public class Source {
    static char srcChar;

    public char getSrcChar()
    {
        return srcChar;
    }

    public void setSrcChar(char srcChar)
    {
        Source.srcChar = srcChar;
    }

    public interface ISource
    {
        char ReadChar();
        char[] ReadChars(int count);
    }

    public static class ReadSource implements ISource
    {
        @Override
        public char ReadChar()
        {
            return srcChar;
        }

        @Override
        public char[] ReadChars(int count)
        {
            /*
             * unfinished bonus questions
             */
            char[] arrayChar = {'0','1', 'n'};
            return arrayChar;
        }
    }
}
