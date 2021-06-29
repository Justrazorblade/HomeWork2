public class HomeWorkApp2 {
    public static void main (String[] args) {
    TwoNumbers(0,9);
    PositiveOrNegative(6);
    Negative(0);
    PrintString("I'am string",6);
    Year(1998);
    }
    //1 задание
    public static boolean TwoNumbers(int a, int b) {
        int c = a + b;
        if (10 < c && c <= 20) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
    //2 задание
    public static void PositiveOrNegative(int number) {
        if (number >= 0){
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }
    //3 задание
    public static boolean Negative(int i) {
        return i < 0;
    }
    //4 задание
    public static void PrintString(String string, int count) {
        for ( int i = 0; i < count; i++){
            System.out.println(string);
        }
    }
    //5 задание
    public static boolean Year(int year){
        if ( year % 4 == 0 && year % 100 != 0) {
            System.out.println("true");
            return true;
        }
        else if ( year % 400 == 0) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }


}
