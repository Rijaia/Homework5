import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void printLeapYear(int leapYear){
        System.out.println(leapYear+" високосный год");
    }
    public static void calculateLeapYear (int year){
            if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
                printLeapYear(year);
            } else {
                System.out.println(year+" не високосный год");
            }
    }
    public static void deliverInDay(int deliveryDistance){
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
    }
    public static void installSystem (int clintDeviceYear, int clientOS){
        if (clintDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");}

    }
    public static void main(String[] args) {
        calculateLeapYear(1996);
        installSystem(2010, 1);
        deliverInDay(3);
    }
}