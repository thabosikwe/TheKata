package com.om.za.kata.interfaces;

public class Source {
    public interface ISource
    {
        char ReadChar();
        char[] ReadChars(int count);
    }

    public class ReadSource implements ISource
    {
        @Override
        public char ReadChar()
        {
            return 'a';
        }

        @Override
        public char[] ReadChars(int count)
        {
            char[] arrayChar = {'n','n'};
            return arrayChar;
        }

    }
}
