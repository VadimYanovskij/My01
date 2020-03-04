package My01;

import javax.swing.*;

public class LogicalOpTable2 {
    public static void main(String args[]) {

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        System.out.print("1" + "\t" + "1" +"\t");

        if (p&q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p|q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p^q)
        System.out.print("1\t" );
        else
        System.out.print("0\t");

        if (!p)
        System.out.println("1\t" );
        else
        System.out.println("0\t");

        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        System.out.print("1" + "\t" + "0" +"\t");

        if (p&q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p|q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p^q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (!p)
            System.out.println("1\t" );
        else
            System.out.println("0\t");

        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        System.out.print("0" + "\t" + "1" +"\t");

        if (p&q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p|q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p^q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (!p)
            System.out.println("1\t" );
        else
            System.out.println("0\t");

        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        System.out.print("0" + "\t" + "0" +"\t");

        if (p&q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p|q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (p^q)
            System.out.print("1\t" );
        else
            System.out.print("0\t");

        if (!p)
            System.out.println("1\t" );
        else
            System.out.println("0\t");
    }
}
