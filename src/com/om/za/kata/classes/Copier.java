package com.om.za.kata.classes;
import com.om.za.kata.interfaces.Source.ISource;
import com.om.za.kata.interfaces.Destination.IDestination;

public class Copier {
    public Copier(ISource src, IDestination dest)
    {
        dest.WriteChar(src.ReadChar());
    }
}
