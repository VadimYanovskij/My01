package My01;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i;
        System.out.print("2\t3\t5\t7\t11\t");
        for (i=8; i<=100; i++)
            if (((i % 2)!=0)&&((i % 3)!=0)&&((i % 5)!=0)&&((i % 7)!=0)&&((i % 11)!=0)) System.out.print(i + "\t");
    }
}
