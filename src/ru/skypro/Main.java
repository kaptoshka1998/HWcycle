package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }

        //Задание 2
        System.out.println();
        int day = 1;
        int b = 0;
        for (;day <= 31; b ++) {
            if (b % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
            day = day + 1;
        }

    //Задание 3
        int c = 0;
        int d = 1822;
        int e = 2122;
        for (c = 0; c < e; c = c + 79 ){
            if (c >= d) {
                System.out.println(c);
            }
        }


    }
}
