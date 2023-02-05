import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 5");
        System.out.println("Задача 1");

        int clintDeviceYear = 2014;
        int clientOS = 1;

        if (clintDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        System.out.println("Задача 3");
        int year = 900;
        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
            System.out.println("Год високосный");
        } else {
        System.out.println("Год не високосный");}

        System.out.println("Задача 4");
        int deliveryDistance =300;
        int time = 1;
        if (deliveryDistance < 20) {
            time = 1;
        } else
        if (deliveryDistance > 20 && deliveryDistance < 60){
            ++time;
        } else if (deliveryDistance > 60 && deliveryDistance <100){
            ++time;
        } else {
            time = -1;
        }
        if (time == -1) {
            System.out.println("Доставка не возможна");
        } else {
         System.out.println("Срок доставки " +time+ " дней");}

        System.out.println("Задача 5");
        int monthNomber = 3;
        switch (monthNomber){
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц относится к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц относится к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц относится к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц относится к осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}