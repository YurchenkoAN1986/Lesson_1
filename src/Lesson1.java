import java.util.Scanner;

public class Lesson1 {

public static void PrintThreeWords() {
    System.out.println("orange");
    System.out.println("banana");
    System.out.println("apple");
}

/*public static void main(String[] args) {
            PrintThreeWords();
        }*/

public static void checkSumSign() {
    int a = 10;
    int b = -5;
    int sum = a + b;

    if (sum >= 0) {
        System.out.println("Сумма положительная");
    } else {
        System.out.println("Сумма отрицательная");
    }
}

public static void printColor(){
    int value = 150;

    if (value <= 0){
        System.out.println("Красный");
    } else if (value >=0 && value <= 100){
        System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }

}

public static void compareNumbers(){
    int a = 5;
    int b = 66;

    if(a >= b){
        System.out.println("a >= b");
    } else {
        System.out.println("a < b");
    }
}

public static boolean checkSum(int a, int b){
    int sum = a + b;
    return sum >= 10 && sum <= 20;
}

public static void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();

    if(number >= 0) {
        System.out.println("Число положительное");
    } else {
        System.out.print("Число отрицательное");
    }
}


public static boolean isNonNegative() {
    int number1 = 10;
    int number2 = -5;

    System.out.println("Число " + number1 + " больше или равно нулю: " + (number1 >= 0));
    System.out.println("Число " + number2 + " больше или равно нулю: " + (number2 >= 0));

    return number1 >= 0;
}




public static void main(String[] args) {
    PrintThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
    System.out.println(checkSum(10, 10));
    checkNumbers();
    System.out.println("Результат: " + isNonNegative());
}
}
