package My01.Chapter1_3;

public class GalToLitTable {
    public static void main(String[] args) {
        double inchs, metres;
        int counter;

        counter = 0;
        for(inchs = 2; inchs <= 144; inchs=inchs+2) {
            metres = inchs / 39.37; // convert to liters
            System.out.println(inchs + " inchs is " +
                    metres + " metres.");

            counter++;
            // every 10th line, print a blank line
            if(counter == 6) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
