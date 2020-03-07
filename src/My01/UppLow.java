package My01;

public class UppLow {

//    Коды АSСII-символов нижнего регистра отличается от кодов соответству­
//    ющих символов  верхнего  регистра  на  величину  32.  Следовательно,  для
//    преобразования строчной буквы в  прописную нужно уменьшить ее код на
//    32. Используйте это обстоятельство для написания программы, читающей
//    символы  с  кл авиа туры. При  выводе результ ато в данная  программа должн а
//    преобразовывать строчные буквы в прописные, а прописные - в строчные.
//    Остал ьные символы  не должны меняться.  Работа программы должна завер­
//    шаться после того, как пользователь введет с клавиатуры точку.  И  наконец,
//    сделайте так, чтобы программа отображала количество символов, для кото­
//    рых был изменен регистр.

    public static void main(String args[])
            throws java.io.IOException {

        char symbol, ignore;
        int  countsymbol=0;

        System.out.println("Введите символ (точка - выход): ");

        do {
            symbol = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');

            if (symbol >= 65 && symbol <= 90) {
                countsymbol++;
                symbol+=32;
                System.out.println(symbol);
            }
            else if (symbol >= 97 && symbol <= 122) {
                countsymbol++;
                symbol-=32;
                System.out.println(symbol);
            }

        } while (symbol != '.');

        System.out.print("Изменено символов: " + countsymbol);

    }

//        public static void main(String args[])
//    throws java.io.IOException {
//            char ch;
//            int changes = 0;
//
//            System.out.println("Enter period to stop.");
//
//            do {
//                ch = (char) System.in.read();
//                if(ch >= 'a' & ch <= 'z') {
//                    ch -= 32;
//                    changes++;
//                    System.out.println(ch);
//                }
//                else if(ch >= 'A' & ch <= 'Z') {
//                    ch += 32;
//                    changes++;
//                    System.out.println(ch);
//                }
//            } while(ch != '.');
//            System.out.println("Case changes: " + changes);
//        }


}
