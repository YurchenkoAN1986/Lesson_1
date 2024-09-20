//import java.util.Scanner;

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
    } else if (value >0 && value <= 100){
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

    int number = -5;

    if(number >= 0) {
        System.out.println("Число положительное");
    } else {
        System.out.println("Число отрицательное");
    }
}


public static boolean isNonNegative() {
    int number = 10;
    return number >= 0;
}

public static void printString(String str, int count){
    for(int i = 0; i<count; i++){
        System.out.println(str);
    }
}

public static boolean checkLeapYear(int year){
    if(year % 4 == 0){
        if(year % 100 ==0){
            if(year % 400 == 0){
                return true;
            } else {
                return false;
            }
        }else {
            return true;
        }
    } else {
        return false;
    }
}

public static int[] swapElements() {
    int[] arr = {0, 0, 0, 1, 1, 1, 0, 0, 0};

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            arr[i] = 1;
        } else {
            arr[i] = 0;
        }
    }

    return arr;
}

public static int[] fillArray() {
    int[] arr = new int[101];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = i;
    }

    return arr;
}
public static void main(String[] args) {
    PrintThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
    System.out.println(checkSum(10, 10));
    checkNumbers();
    System.out.println("Результат: " + isNonNegative());
    printString("Hello World", 3);
    System.out.println("2024 is a leap year: " + checkLeapYear(2024));
    for (int num : swapElements()) {
        System.out.print(num + " ");
    }

    System.out.println();

    for (int num : fillArray()) {
        System.out.print(num + " ");
    }
}
}
