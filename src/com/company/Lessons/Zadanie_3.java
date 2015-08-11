package com.company.Lessons;

/**
 * Created by Никита on 01/04/15.
 */




public class Zadanie_3 {
    public  int height;           // свойства
    public  int width ;           // свойства
    public boolean isOpened;      // свойства
    public boolean isLocked;      // свойства

    public Zadanie_3(int h, int w, boolean isOpened, boolean isLocked){    // конструктор
        this.height = h;                                                   // конструктор
        this.width = w;                                                   // конструктор
        this.isOpened = isOpened;                                        // конструктор
        this.isLocked = isLocked;                                         // конструктор

    }


        public  String toString(){

    String s = "Size: " + height + " x " + width + " mm" + "\n"+        // метод
               "Opened: " + isOpened  +                                 // метод   (что-то выполняет)
                "\n"  + "Locked: " + isLocked;                         // метод
        return s;                                                     // результат метода
        }



    public static void main(String[] args) {

        Zadanie_3 ProDoor1 = new Zadanie_3(2000, 1000, false, true);
        String ProDoor = ProDoor1.toString();                               // программа


        System.out.println("Door1 info: " + "\n" + ProDoor1 + "\n");



        Zadanie_3 ProDoor2 = new Zadanie_3(3000, 2000, true, false);
        String ProDoor2info = ProDoor2.toString();

        System.out.println("DoorInfo2: " + "\n" + ProDoor2info);}}

