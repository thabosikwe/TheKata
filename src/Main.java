import com.om.za.kata.interfaces.Name;
import com.om.za.kata.interfaces.Name.displayName;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.mockito.mock.*;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import static org.mockito.Mockito.mock;
//import com.om.za.kata.interfaces.Name;
import com.om.za.kata.interfaces.Name.displayN;

public class Main {
    public static void main(String[] args) {

        try
        {
            displayN dn = new displayN();
            Name.displayN ndn = new Name.displayN();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String newname = br.readLine();
            System.out.println("BufferedReader output: " + newname);
            System.out.println(newname.contains("\\n"));
            System.out.println(newname.indexOf("\\n"));
            System.out.println(newname.charAt((newname.indexOf("\\n"))+2));

            ndn.displayDetails();
            dn.displayDetails();
            String name = ndn.getName();
            boolean bool = name.contains("\\");
            System.out.println(bool);
            System.out.println(name.contains("\\n"));
            System.out.println(name.indexOf("\\"));
            System.out.println(name);

            System.out.printf("Hello and welcome!");
            List mockedList = mock(List.class);
            mockedList.add("one");
            mockedList.clear();


            for (int i = 1; i <= 5; i++) {
                System.out.println("i = " + i);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

}

interface displayName2
{
    void  displayDetails();
}

class displayNLocal implements displayName2
{
    @Override
    public void displayDetails()
    {
        System.out.println("Hello World Interface Impl");
    }

}


