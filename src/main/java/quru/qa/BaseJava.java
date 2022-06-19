package quru.qa;

public class BaseJava {

    public static void main(String[] args) {
        AllDataTypes ();
        MathOperators();
        LogicalAndCompareOperators();
        OverFullExamples();
        IfElse ();
    }

    public static void AllDataTypes () {

        boolean exBool = true; // true, false
        char exCharacter = 'v'; // символ UTF-16 (буквы и цифры)

        byte exByte = -128; // -128 .. 127
        short exShort = -32768; // -32768 .. 32767
        int exInt = -2147483648; // -2147483648 .. 2147483647
        long exLong = 9223372036854775807L; // -9223372036854775808L .. 9223372036854775807L

        float exFloat = 2.7F;
        double exDouble = 7.5;

        String name = "Пример"; // Буквы
    }

    public static void MathOperators() {
        int a = 10;
        int b = 5;

        double c = 1.5;
        long d = 922337203685477580L;

        System.out.println("Результат оператора '+': " + (a+b)); // оператор +
        System.out.println("Результат оператора '-': " + (a-b)); // оператор -
        System.out.println("Результат оператора '*': " + (a*b)); // оператор *
        System.out.println("Результат оператора '/': " + (a/b)); // оператор /
        System.out.println("Результат оператора '%': " + (a%b)); // оператор %
        System.out.println("Результат оператора '++': " + (a++)); // оператор ++
        System.out.println("Результат оператора '--': " + (b--)); // оператор --

        System.out.println("Результат операции + с int и double: " + (a+c));
        System.out.println("Результат операции - с int и double: " + (b+c));
        System.out.println("Результат операции * с int и double: " + (a*c));
        System.out.println("Результат операции / с int и double: " + (a/c));
        System.out.println("Результат операции % с int и double: " + (b%c));

        System.out.println("Результат операции + с int и long: " + (a+d));
        System.out.println("Результат операции - с int и long: " + (b+d));
        System.out.println("Результат операции * с int и long: " + (a*d));
        System.out.println("Результат операции / с int и long: " + (a/d));
        System.out.println("Результат операции % с int и long: " + (b%d));
    }

    public static void LogicalAndCompareOperators () {
        boolean result1 = ((3 < 2) || (4 < 2));
        boolean result2 = 3 >= 2;
        boolean result3 = 3 > 2;
        boolean result4 = 3 <= 2;
        boolean result5 = 3 != 2;
        boolean result6 = 3 == 2;
        boolean result7 = !(3 > 2) && 3 > 2;

        System.out.println("Пример операторов < и || " + result1);
        System.out.println("Пример оператора >= " + result2);
        System.out.println("Пример оператора > " + result3);
        System.out.println("Пример оператора <= " + result4);
        System.out.println("Пример оператора !=  " + result5);
        System.out.println("Пример оператора == " + result6);
        System.out.println("Пример оператора && " + result7);
    }
    
    public static void OverFullExamples () {
        int over1 = 2147483647;
        System.out.println("Пример переполнения максимума типа int: " + (over1+1000));

        int over2 = -2147483648;
        System.out.println("Пример переполнения минимума типа int: " + (over2-1000));

        long over3 = 9223372036854775807L;
        System.out.println("Пример переполнения максимума типа long: " + (over3+over1));

        long over4 = -9223372036854775808L;
        System.out.println("Пример переполнения минимума типа long: " + (over4-over1));
    }

    public static void IfElse () {
        if (1!=2 && 2>1) {
            System.out.println("Выражение верное");
        }
        else System.out.println("Выражение не верное");
    }
}
