package My01;

//Напишите программу,  которая считает символы с клавиатуры до тех пор,
//пока  не встретится точка.  Предусмотрите  в  программе счетчик пробелов.
//Сведения о количестве пробелов должны выводиться в конце программы.

public class SymbolCount {
    public static void main(String args[])
        throws java.io.IOException {

            char symbol, ignore;
            int countspace=0, countsymbol=0;

            for (;;){
                System.out.println("Введите символ (точка - выход): ");
                symbol = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');

                if (symbol == ' ') {
                    countspace++;
                    countsymbol++;
                    System.out.println("Символов: " + countsymbol);
                }
                else if (symbol == '.') break;
                else {
                    countsymbol++;
                    System.out.println("Символов: " + countsymbol);
                }

            }

                System.out.print("Пробелов: " + countspace);

        }


}
