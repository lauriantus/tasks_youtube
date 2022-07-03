package com;

public class lesson2 {
    public static void main(String[] args) {
        /*
        1) Создать по одной переменной каждого типа данных, который ты знаешь.
        2) Присвоить каждой переменной значение в диапазоне типа.
        3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
        */

/*
1) Создать три переменных (number1, number2, number3) типа int, присвоить им значение 10, 18, 21 соответственно.
2) Не используя чисел, сделать так, чтобы значение у переменной number1 изменилось на 18
2) Не используя чисел, сделать так, чтобы значение у переменной number2 изменилось на 21
2) Не используя чисел, сделать так, чтобы значение у переменной number3 изменилось на 10
3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
*/
        /*
        byte b = 127;
        // 1 byte       __(-128 ; 127)
        System.out.println("byte = " + b);
        short s = 10000;
        // 2 bytes      __(-32768 ; 32767)
        System.out.println("short = " + s);
        char c = 49;
        // 2 bytes      __беззнаковое целое число - UTF-16(буквы и цифры)
        System.out.println("char = " + c);
        int i = 589695;
        // 4 bytes      __ (-2147483648; 2147483647)
        System.out.println("int= " + i);
        long l = 6546421L;
        // 8 bytes      __ 2^64
        System.out.println("long= " + l);
        float f = 21.75F;
        // 4 bytes      __
        System.out.println("float= " + f);
        double d = 121.3;
        // 8 bytes      __
        System.out.println("double= " + d);
        boolean bool = true;
        // 1 byte in arrays else 4 bytes
        System.out.println("bool= " + bool);
        System.out.println("//========================================================================================");
        */
        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int temp = 0;
        temp = number1;
        number1 = number2;
        number2 = number3;
        number3 = temp;
        System.out.println(number1 + "\t" + number2 + "\t" + number3);
    }
}
