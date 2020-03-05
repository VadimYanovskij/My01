package My01;

public class PrimeNumbers {
    public static void main(String[] args) {
      int i,j;

//        System.out.print("2\t3\t5\t7\t11\t");
//        for (i=8; i<=100; i++)
//            if (((i % 2)!=0)&&((i % 3)!=0)&&((i % 5)!=0)&&((i % 7)!=0)&&((i % 11)!=0)) System.out.print(i + "\t");


      boolean isprime;
        for (i = 2; i <= 100; i++) {
            isprime = true;
            for (j = 2; j <= i/j; j++)
                if ((i % j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " простое");


        }
    }
}

