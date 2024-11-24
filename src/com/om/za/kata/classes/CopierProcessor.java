package com.om.za.kata.classes;
import com.om.za.kata.interfaces.Destination;
import com.om.za.kata.interfaces.Source;

public class CopierProcessor {
    public void Processor(String charReader, int counter)
    {
        Source srcClass = new Source();
        Source.ReadSource rdSrc = new Source.ReadSource();
        Destination dest = new Destination();

        try
        {
            if (charReader.contains("\\n"))
            {
                if (counter > 1)
                {
                    int split = Math.abs(charReader.length() / counter);
                    int rem = (charReader.length() % counter);

                    /*
                     * ABSOLUTE of DIVISION} function to get the total number of array splits
                     * REMAINDER} function to get the total number of remaining characters from
                     * the split
                     * unfinished bonus question
                     */

                    for (int i = 0; i < charReader.indexOf("\\n"); i++) {
                        srcClass.setSrcChar(charReader.charAt(i));
                        dest.WriteChar(charReader.charAt(i));
                    }
//                    System.out.println(dest.getDestChars());
                }
                else
                {
                    for (int i = 0; i < charReader.indexOf("\\n"); i++) {
                        srcClass.setSrcChar(charReader.charAt(i));
                        dest.WriteChar(charReader.charAt(i));
                    }
//                    System.out.println(dest.getDestChars());
                }
            }
            else
            {
                System.out.println("Your didn't capture the end of line carriage: \\n");
            }
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }
}
