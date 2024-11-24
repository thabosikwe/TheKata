import com.om.za.kata.classes.CopierProcessor;
import com.om.za.kata.interfaces.Destination;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.mockito.Mockito.mock;

import com.om.za.kata.interfaces.Source;
import com.om.za.kata.interfaces.Source.ReadSource;

public class Main {
    public static void main(String[] args)
    {
        int counter = 0;
        Source srcClass = new Source();
        ReadSource rdSrc = new ReadSource();
        Destination dest = new Destination();
        CopierProcessor cpr = new CopierProcessor();

        try
        {
            System.out.println("Please capture the number representing total number of characters to read and write:" +
                    "\nPress ENTER to proceed with default single character read and write.");
            try
            {
                counter = Integer.parseInt(System.console().readLine());
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Seems the number you captured is not valid... we will proceed");
            }
            System.out.println("Please capture your input. To determine end of input enter '\\n': ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputstr = br.readLine();

            /*
             * System.console.ReadLine() doesn't see the \n in the console.
             * Hence the use of BufferedReader
             */

            cpr.Processor(inputstr, counter);

            try {
                System.out.println("\n\n:::: Initializing MOCKITO Library :::");
                CopierProcessor mockedCpr = mock(CopierProcessor.class);
                mockedCpr.Processor(inputstr, counter);
            }
            catch (Exception ex)
            {
                System.out.println("Mockito paused.");
            }
            System.out.println("KATA Completed. Thank you");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

}





